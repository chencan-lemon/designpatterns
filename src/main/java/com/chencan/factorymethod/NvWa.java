package com.chencan.factorymethod;

//女娲
public class NvWa {
    public static void main(String[] args) {
        Human human = HumanFacoty.createHuman(YellowHuman.class);
        human.laugh();
        human.cry();
        human.talk();
    }
}
