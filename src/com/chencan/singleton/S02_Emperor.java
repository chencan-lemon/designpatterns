package com.chencan.singleton;

/**
 * 懒汉式 lazy loading
 * 什么时候需要用到，就什么时候创建
 * 线程不安全
 * 原因？
 * 假设现在有2个线程，线程1和线程2，线程1正在申请内存分配，可能需要1秒，
 * 在这1秒内，线程2执行if (EMPEROR == null)，由于线程1还没有完成实例化，
 * 线程2也会继续执行，所以内存中会创建2个EMPEROR的实例
 */
public class S02_Emperor {

    private static S02_Emperor EMPEROR = null;

    private S02_Emperor() {};

    public static S02_Emperor getInstance() {
        if (EMPEROR == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            EMPEROR = new S02_Emperor();
        }
        return EMPEROR;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread( ()->
                    System.out.println(S02_Emperor.getInstance())
            ).start();

        }
    }
}
