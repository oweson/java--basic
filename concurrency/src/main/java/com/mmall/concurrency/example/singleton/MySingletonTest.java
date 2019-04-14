package com.mmall.concurrency.example.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/25 0025 21:42
 */
public class MySingletonTest {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getMySingleton();
        MySingleton mySingleton02 = MySingleton.getMySingleton();
        MyEnum instance = MyEnum.INSTANCE;
        MyEnum instance02 = MyEnum.INSTANCE;
        System.out.println(mySingleton==mySingleton02);
        System.out.println(instance==instance02);
    }
}
