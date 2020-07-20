package com.chencan.factorymethod;

public class WhiteHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("WhiteHuman can laugh");
    }

    @Override
    public void cry() {
        System.out.println("WhiteHuman can cry");
    }

    @Override
    public void talk() {
        System.out.println("WhiteHuman can talk");
    }
}
