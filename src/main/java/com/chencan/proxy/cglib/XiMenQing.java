package com.chencan.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * cglib实现动态代理不需要接口，这是由cglib自带的动态代理Proxy决定的
 */
public class XiMenQing {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PanJinLian.class);
        enhancer.setCallback(new WangPoProxy());
        PanJinLian panJinLian = (PanJinLian) enhancer.create();
        panJinLian.makeEyesWithMan();
        panJinLian.happyWithMan();
    }



}
