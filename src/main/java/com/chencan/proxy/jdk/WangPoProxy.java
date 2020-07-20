package com.chencan.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * jdk反射生成代理必须面向接口，这是由jdk自带的动态代理Proxy决定的
 */
public class WangPoProxy implements InvocationHandler {
    KindWomen kindWomen;
    public WangPoProxy(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }
    public void before() {
        System.out.println("method start...");
    }
    public void after() {
        System.out.println("method stop...");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(kindWomen, args);
        after();
        return o;
    }
}
