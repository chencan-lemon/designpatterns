package com.chencan.proxy.aopInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *AOP：面向切面编程
 * 横切： 分离代码与业务逻辑代码
 * 分离代理行为与被代理对象
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
