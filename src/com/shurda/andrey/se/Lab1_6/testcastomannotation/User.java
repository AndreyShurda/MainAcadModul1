package com.shurda.andrey.se.Lab1_6.testcastomannotation;

import java.util.ArrayList;
import java.util.List;

/**
 * Add package “com.brainacad.oop.testcustomannotation”.
 * Write a program that implements a different access to the file operation for different users using annotations.
 * 1) Create a enum type PermissionAction which specify access to operations on the file (example, USER_READ, USER_CHANGE, …).
 * 2) Create a class User with private fields: name of String type and permissions of List<PermissionAction> type.
 * Add to User constructor with name argument and override toString() method to return name of user.
 * Add to User methods to get the permissions list and add a new permission.
 * 3) Describe custom annotation MyPermission with value() method, which returns value PermissionAction of type.
 * Annotation should have a policy of retention RetentionPolicy.RUNTIME and used with methods.
 */
public class User {
    private String name;
    private List<PermissionAction> permissions = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addPermission(PermissionAction permission) {
        List<PermissionAction> permissions = getPermissions();
        permissions.add(permission);
    }

    public List<PermissionAction> getPermissions() {
        return permissions;
    }

    @Override
    public String toString() {
        return "User = " + name;
    }
}
