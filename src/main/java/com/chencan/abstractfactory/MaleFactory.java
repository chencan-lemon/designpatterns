package com.chencan.abstractfactory;

public  class MaleFactory extends AbstractFactory{

    @Override
    Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    @Override
    Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
