package com.chencan.abstractfactory;

public class FemaleFactory extends AbstractFactory{
    @Override
    Human createYellowHuman() {
        return new FemaleYellowHuman();
    }

    @Override
    Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
