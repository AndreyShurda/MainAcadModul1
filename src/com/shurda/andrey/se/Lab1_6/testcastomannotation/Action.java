package com.shurda.andrey.se.Lab1_6.testcastomannotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import static com.shurda.andrey.se.Lab1_6.testcastomannotation.PermissionAction.*;

public class Action {

    @MyPermission(USER_READ)
    public void readingFile(User user) {
        accessToMethod(user, "readingFile");
    }

    @MyPermission(USER_WRITE)
    public void writingFile(User user) {
        accessToMethod(user, "writingFile");
    }

    private <T extends Annotation> T findAnnotationOnMethodOrClass(Class<T> annotationType, Method method) {
        T annotation = method.getDeclaredAnnotation(annotationType);
        if (annotation != null) {
            return annotation;
        }

        return null;
    }

    private void accessToMethod(User user, String methodName) {
        try {
            Method method = this.getClass().getDeclaredMethod(methodName, new Class<?>[]{User.class});

            MyPermission annotation = method.getDeclaredAnnotation(MyPermission.class);
//            System.out.println(annotation.value());
            if (user.getPermissions().contains(annotation.value())) {
                System.out.println(user + " can " + method.getName() + " file");
            } else {
                System.out.println(user + " not access to file from method " + method.getName());
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}
