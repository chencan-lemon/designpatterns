package com.chencan.singleton;

/**
 * 大臣
 */
public class Minister {
    public static void main(String[] args) {
//        S01_Emperor e1 = S01_Emperor.getInstance();
//        S01_Emperor e2 = S01_Emperor.getInstance();
//        System.out.println(e1 == e2);

        S02_Emperor e1 = S02_Emperor.getInstance();
        S02_Emperor e2 = S02_Emperor.getInstance();
        System.out.println(e1 == e2);
    }
}
