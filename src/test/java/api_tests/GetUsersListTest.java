package api_tests;

import models.UsersList;
import org.openqa.selenium.json.Json;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.ReqResService;

public class GetUsersListTest {

    @Test
    public void test_GetUsersListTest() {
        UsersList userList = new ReqResService().getUserList();
        Assert.assertFalse(new Json().toJson(userList).contains("null"), "The UserList object has NULL");
    }
}
