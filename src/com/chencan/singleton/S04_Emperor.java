package com.chencan.singleton;
/**
 * 懒汉式 lazy loading
 * 什么时候需要用到，就什么时候创建
 * 静态内部类方式：JVM保证单例
 * 加载外部类时，不会加载内部类
 */
public class S04_Emperor {

    private S04_Emperor() {};

    private static class EmperorHolder {
        private final static S04_Emperor EMPEROR = new S04_Emperor();
    }

    public static S04_Emperor getInstance() {
        return EmperorHolder.EMPEROR;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread( ()->
                    System.out.println(S04_Emperor.getInstance().hashCode())
            ).start();

        }
    }
}
