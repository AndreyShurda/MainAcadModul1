package com.shurda.andrey.se.Lab1_6.testcastomannotation;

import java.util.List;

public class Action {

    @MyPermission(PermissionAction.USER_READ)
    public void readingFile(User user) {
//        List<PermissionAction> permissions = user.getPermissions();
//        for (PermissionAction permission : permissions) {
//            if (permission == PermissionAction.USER_READ) {
//                System.out.println(user + " file read");
//                return;
//            }
//        }
//        System.out.println(user + " not access to read");
        System.out.println("reading file");
    }

    @MyPermission(PermissionAction.USER_WRITE)
    public void writingFile(User user) {
//        List<PermissionAction> permissions = user.getPermissions();
//        for (PermissionAction permission : permissions) {
//            if (permission == PermissionAction.USER_WRITE) {
//                System.out.println(user + " file write");
//                return;
//            }
//        }

//        System.out.println(user + " not access to write");
        System.out.println("writing file");

    }
}
