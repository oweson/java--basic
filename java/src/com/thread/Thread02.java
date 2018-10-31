package com.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 22:01
 */
public class Thread02 {
    public static void sth() {
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        int a = 1000;
        // FIXME: 2018/6/22 0022
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            System.out.println();

        }

        new Pig().start();
        for (int i = 0; i < 100; i++) {
            Thread.sleep(1);
            System.out.println("hello");
        }

    }
}

class Pig extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("world");
        }
    }
}
