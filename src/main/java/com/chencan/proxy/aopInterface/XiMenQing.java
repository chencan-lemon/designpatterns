package com.chencan.proxy.aopInterface;

import java.lang.reflect.Proxy;

public class XiMenQing {

    public static void main(String[] args) {
        PanJinLian panJinLian = new PanJinLian();
        KindWomen kindWomen = (KindWomen) Proxy.newProxyInstance(
                panJinLian.getClass().getClassLoader(),
                new Class[]{KindWomen.class},
                new WangPoProxy(panJinLian)
                );
        kindWomen.makeEyesWithMan();
        kindWomen.happyWithMan();
    }
}
