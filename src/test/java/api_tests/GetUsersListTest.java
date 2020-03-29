package api_tests;

import models.Ad;
import models.ExistingUser;
import models.UsersList;
import org.testng.Assert;
import org.testng.annotations.Test;
import services.ReqResService;

import java.lang.reflect.Field;
import java.util.List;

public class GetUsersListTest {

    @Test
    public void getUsersListTest() {
        UsersList userList = new ReqResService().getUserList();
        Field[] declaredUserListFields = userList.getClass().getDeclaredFields();
        checkFieldHasNoNullValue(userList, declaredUserListFields);

        List<ExistingUser> userListDataList = userList.getData();
        for (ExistingUser existingUser : userListDataList){
            Field[] declaredDataFields = existingUser.getClass().getDeclaredFields();
            checkFieldHasNoNullValue(existingUser, declaredDataFields);
        }

        Ad userListAd = userList.getAd();
        Field[] declaredAdFields = userListAd.getClass().getDeclaredFields();
        checkFieldHasNoNullValue(userListAd, declaredAdFields);
    }

    private void checkFieldHasNoNullValue(Object object, Field[] declaredFields) {
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object fieldObject = null;
            try {
                fieldObject = field.get(object);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            Assert.assertNotNull(fieldObject);
        }
    }
}
