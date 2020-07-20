package com.chencan.proxy.init;

public class XiMenQing {

    public static void main(String[] args) {
        WangPo wangPo = new WangPo();//把WangPo叫出来，默认是PanJinLian的代理
        wangPo.makeEyesWithMan();//PanJinLian
        wangPo.happyWithMan();//PanJinLian
    }
}
