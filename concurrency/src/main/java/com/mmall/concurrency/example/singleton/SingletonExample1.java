package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;

/**
 * 懒汉模式
 * 单例实例在第一次使用时进行创建
 */
@NotThreadSafe
public class SingletonExample1 {

    // 1 私有构造函数
    private SingletonExample1() {

    }

    // 2 单例对象
    private static SingletonExample1 instance = null;

    // 3 静态的工厂方法
    public static synchronized SingletonExample1 getInstance() {
        if (instance == null) {
            instance = new SingletonExample1();
        }
        return instance;
    }
}
