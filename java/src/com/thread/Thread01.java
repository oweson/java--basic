package com.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 21:56
 */
public class Thread01 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + "jaas");
        }
        for (int k = 0; k < 21000; k += 100) {
            new Finals();
        }
    }
}

class Finals {
    @Override
    protected void finalize() throws Throwable {
        // super.finalize();
        System.out.println("垃圾被回收....");
    }
}
