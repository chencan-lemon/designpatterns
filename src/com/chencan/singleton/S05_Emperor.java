package com.chencan.singleton;


/**
 *枚举
 * 既可以解决线程同步问题，又可以防止反序列化
 */
public enum  S05_Emperor {

    EMPEROR;

    public void m() {}

    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            new Thread(()->{
                System.out.println(S05_Emperor.EMPEROR.hashCode());
            }).start();
        }
    }
}
