package services;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.specification.RequestSpecification;
import models.User;
import models.UsersList;
import org.openqa.selenium.json.Json;

import static io.restassured.filter.log.LogDetail.ALL;
import static io.restassured.http.ContentType.JSON;

public class ReqResService {
    private final RequestSpecification requestSpecification;

    public ReqResService() {
        String baseUri = "https://reqres.in/api/";
        requestSpecification = new RequestSpecBuilder()
                .setContentType(JSON)
                .setBaseUri(baseUri)
                .log(ALL)
                .build();
    }

    public UsersList getUserList() {
        return RestAssured
                .given()
                .spec(requestSpecification)
                .get("users?page=2")
                .then()
                .statusCode(200)
                .extract()
                .as(UsersList.class, ObjectMapperType.GSON);
    }

    public User postUserCreation(User user) {
        return RestAssured
                .given()
                .spec(requestSpecification)
                .body(new Json().toJson(user))
                .post("users")
                .then()
                .statusCode(201)
                .extract()
                .as(User.class, ObjectMapperType.GSON);
    }
}
