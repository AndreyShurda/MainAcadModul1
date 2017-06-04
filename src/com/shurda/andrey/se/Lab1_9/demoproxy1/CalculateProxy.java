package com.shurda.andrey.se.Lab1_9.demoproxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;

public class CalculateProxy implements InvocationHandler {
    private Class[] interfaces;
    private Object[] delegates;

    private CalculateProxy(Class[] interfaces, Object[] delegates) {
        this.interfaces = interfaces;
        this.delegates = delegates;
    }

    public static Object newInstance(Class obj) {
        Object[] delegators = new Object[]{new CalculateImpl(), new CalculateBitwiseImpl()};

        List<Class<?>> listInterfaces = Arrays.asList(Calculate.class, CalculateBitwise.class);
        if (listInterfaces.contains(obj)) {
            Class[] proxyInterfaces = listInterfaces.toArray(new Class[listInterfaces.size()]);
            return Proxy.newProxyInstance(
                    obj.getClassLoader(),
                    proxyInterfaces,
                    new CalculateProxy(proxyInterfaces, delegators));
        }
        System.out.println("Can not create object!");
        return null;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Class declaringClass = method.getDeclaringClass();
        System.out.print("Method name: \"" + method.getName() + "\"");
        System.out.println(" with args: " + Arrays.toString(args));
        Object result = null;

        for (int i = 0; i < interfaces.length; i++) {
            if (declaringClass.isAssignableFrom(interfaces[i])) {
                result = method.invoke(delegates[i], args);
                return result;
            }
        }
        System.out.println("result: " + result.toString());
        return result;
    }

}

