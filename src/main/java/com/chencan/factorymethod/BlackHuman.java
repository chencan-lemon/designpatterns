package com.chencan.factorymethod;

public class BlackHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("BlackHuman can laugh");
    }

    @Override
    public void cry() {
        System.out.println("BlackHuman can cry");
    }

    @Override
    public void talk() {
        System.out.println("BlackHuman can talk");
    }
}
