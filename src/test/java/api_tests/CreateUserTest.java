package api_tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.ReqResService;

public class CreateUserTest {

    @Test
    public void test_CreateUserTest() {
        User user = new User();
        user.setName("Anderson");
        user.setJob("Tester");
        User createdUser = new ReqResService().postUserCreation(user);
        Assert.assertEquals(createdUser, user);
    }
}
