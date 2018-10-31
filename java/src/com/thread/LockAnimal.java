package com.thread;

import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 22:17
 */
public class LockAnimal {
    public static void main(String[] args) {
        Date date = new Date();
        final Fish fish = new Fish();
        new Thread() {
            @Override
            public void run() {


                while (true) {
                    fish.eat();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    fish.say();

                }
            }
        }.start();
    }
}

class Fish {
    Date d = new Date();

    public void say() {
        synchronized (d) {
            System.out.print("我");
            System.out.print("是");
            System.out.print("中");
            System.out.print("华");
            System.out.println("浔");
            System.out.println("---------------------------");
        }
    }

    public void eat() {
        synchronized (d) {
            System.out.print("洗");
            System.out.print("欢");
            System.out.print("喝");
            System.out.println("水");
            System.out.println("==============================");
        }
    }
}
