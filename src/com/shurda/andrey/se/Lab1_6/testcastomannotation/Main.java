package com.shurda.andrey.se.Lab1_6.testcastomannotation;

import java.lang.reflect.Method;

import static com.shurda.andrey.se.Lab1_6.testcastomannotation.PermissionAction.*;

/**
 * 1) Create an Action class with methods for reading and writing to a file. Methods should be annotated @MyPermission
 * with proper access rights. Methods must to get a user who wants execute them. Methods of using reflection make a
 * decision: to allow access to the file and perform the work, or refuse access and to give a message.
 * 2) Create a class Main with a main() method, which creates an instance of Action and multiple users with different
 * access rights. Then demonstrates working with the file for different users.
 */
public class Main {
    public static void main(String[] args) {
        Action action = new Action();

        User user = new User("Ivan");
        user.addPermission(USER_WRITE);

        User user2 = new User("Petr");
        user2.addPermission(USER_WRITE);

//        getAccess(action, user);
//        getAccess(action, user2);

        action.readingFile(user);
//        action.writingFile(user);
//
//        action.readingFile(user2);
//        action.writingFile(user2);
    }

    private static void getAccess(Action action, User user) {
        Class<Action> actionClass = Action.class;
        for (Method method : actionClass.getDeclaredMethods()) {
//            System.out.println(method.getAnnotation(MyPermission.class).value());
            PermissionAction permission = method.getAnnotation(MyPermission.class).value();
            for (PermissionAction permissionAction : user.getPermissions()) {

                if (permission == permissionAction) {
                    action.readingFile(user);
//                    action.writingFile(user);
                }
            }
        }
    }
}
