package com.chencan.factorymethod;

/**
 * 简单工厂的可扩展性不好
 */
public class SimpleFactory {

    public YellowHuman createYellowHuman() {
        return new YellowHuman();
    }

    public WhiteHuman createWhiteHuman() {
        return new WhiteHuman();
    }

    public BlackHuman createBlackHuman() {
        return new BlackHuman();
    }
}
