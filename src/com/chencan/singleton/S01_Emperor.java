package com.chencan.singleton;

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 优点：简单实用
 * 缺点：无论是否用到，类装载时就完成实例化
 */
public class S01_Emperor {

    private static final S01_Emperor EMPEROR = new S01_Emperor();

    //不能直接生产实例(皇帝)
    private S01_Emperor() {};

    public static S01_Emperor getInstance() {
        return EMPEROR;
    }
}
