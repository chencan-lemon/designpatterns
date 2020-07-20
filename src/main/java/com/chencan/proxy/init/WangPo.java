package com.chencan.proxy.init;

//代理类：中间人
public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo() {//default: PanJinLian的代理
        this.kindWomen = new PanJinLian();
    }

    public WangPo(KindWomen kindWomen) {//可以是KindWomen类型的任何一个女人的代理
        this.kindWomen = kindWomen;
    }
    @Override
    public void makeEyesWithMan() {//被代理类在完成任务
        this.kindWomen.happyWithMan();
    }

    @Override
    public void happyWithMan() {//被代理类在完成任务
        this.kindWomen.makeEyesWithMan();
    }
}
