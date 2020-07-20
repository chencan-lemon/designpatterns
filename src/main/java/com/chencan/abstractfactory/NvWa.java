package com.chencan.abstractfactory;

public class NvWa {
    public static void main(String[] args) {
        //男性生产线
        MaleFactory maleFactory = new MaleFactory();
        //女性生产线
        FemaleFactory femaleFactory = new FemaleFactory();
        //生产人
        Human maleYellowHuman = maleFactory.createYellowHuman();
        Human femaleYellowHuman = femaleFactory.createYellowHuman();
        maleYellowHuman.talk();
        femaleYellowHuman.talk();
    }
}
