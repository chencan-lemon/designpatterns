package com.chencan.factorymethod;

public class YellowHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("YellowHuman can laugh");
    }

    @Override
    public void cry() {
        System.out.println("YellowHuman can cry");
    }

    @Override
    public void talk() {
        System.out.println("YellowHuman can talk");
    }
}
