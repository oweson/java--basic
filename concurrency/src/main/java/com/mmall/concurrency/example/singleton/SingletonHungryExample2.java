package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.ThreadSafe;

/**
 * 饿汉模式
 * 单例实例在类装载时进行创建
 */
@ThreadSafe
public class SingletonHungryExample2 {

    // 1 私有构造函数
    private SingletonHungryExample2() {

    }

    // 2 单例对象
    private static SingletonHungryExample2 instance = new SingletonHungryExample2();

    // 3 静态的工厂方法
    public static SingletonHungryExample2 getInstance() {
        return instance;
    }
}
