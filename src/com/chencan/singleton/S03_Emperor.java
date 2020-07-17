package com.chencan.singleton;
/**
 * 懒汉式 lazy loading
 * 什么时候需要用到，就什么时候创建
 * volatile：保证多线程下的单例
 * （Effecitve Java）
 */
public class S03_Emperor {

    private static volatile  S03_Emperor EMPEROR = null;

    private S03_Emperor() {};

    public static S03_Emperor getInstance() {
        if (EMPEROR == null) {
            //双重检查
            synchronized (S03_Emperor.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EMPEROR = new S03_Emperor();
            }
        }
        return EMPEROR;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread( ()->
                    System.out.println(S03_Emperor.getInstance().hashCode())
            ).start();

        }
    }

}
