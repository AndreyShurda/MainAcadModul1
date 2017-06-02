package com.shurda.andrey.se.Lab1_9.demoproxy1;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class CalculateProxy implements InvocationHandler {
    private Object objCalc;

    private CalculateProxy(Object target) {
        this.objCalc = target;
    }

    public static Object newInstance(Object obj) {
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader(),
                obj.getClass().getInterfaces(),
                new CalculateProxy(obj));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print("Method name: \"" + method.getName() + "\"");
        System.out.println(" with args: " + Arrays.toString(args));
        Object result = method.invoke(objCalc, args);

        System.out.println("result: " + result.toString());

        return result;
    }
}
