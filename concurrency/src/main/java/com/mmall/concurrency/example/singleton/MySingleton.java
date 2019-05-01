package com.mmall.concurrency.example.singleton;

import java.io.Serializable;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/25 0025 21:37
 */
public class MySingleton implements Serializable {
    private volatile static MySingleton mySingleton;

    private MySingleton() {
    }

    public static MySingleton getMySingleton() {
        if (mySingleton == null) {
            synchronized (MySingleton.class) {
                if (mySingleton == null) {
                    mySingleton = new MySingleton();
                }
            }
        }
        return mySingleton;
    }


}

enum MyEnum {
    // 枚举单例可以自己处理序列化
    // 枚举单例是线程安全的,总结：
    // 通过提供序列化和线程安全并且几行代码搞定，
    // 说明枚举单例模式是java5之后创建单例最好的方法。
    // 你仍然可以使用其它你感觉很流行的方式来创建单例，
    // 但是我还是要找一个能够使我信服的观点让我不去使用枚举作为单例，如果你有，请告诉我！(*^__^*)
    INSTANCE;
}
