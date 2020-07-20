package com.chencan.proxy.init;

//被代理类：实际做事的
public class PanJinLian implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("PanJinLian makeEyesWithMan");
    }

    @Override
    public void happyWithMan() {
        System.out.println("PanJinLian happyWithMan");
    }

}
