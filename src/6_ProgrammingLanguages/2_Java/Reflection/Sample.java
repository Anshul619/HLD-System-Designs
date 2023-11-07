package DesignComponents.Java.Reflection;

/**
 * Reference - https://www.geeksforgeeks.org/reflection-in-java/
 */

import java.lang.reflect.Field;

public class Sample {

    static class User {
        int id;
        String name;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        User userObj = new User();
        userObj.id = 100;
        userObj.name = "Anshul";

        Field nameField = userObj.getClass().getDeclaredField("name");
        String nameValue = nameField.get(userObj).toString();
        System.out.println(nameValue);

        Field idField = userObj.getClass().getDeclaredField("id");
        String idValue = idField.get(userObj).toString();
        System.out.println(idValue);
    }
}
