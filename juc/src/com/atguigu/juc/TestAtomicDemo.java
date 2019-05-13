package com.atguigu.juc;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 一、i++ 的原子性问题：i++ 的操作实际上分为三个步骤“读-改-写”
 * int i = 10;
 * i = i++; //10
 * int temp = i;
 * i = i + 1;
 * i = temp;
 * 二、原子变量：在 java.util.concurrent.atomic 包下提供了一些原子变量。
 * 1. volatile 保证内存可见性
 * 2. CAS（Compare-And-Swap） 算法保证数据变量的原子性
 * CAS 算法是硬件对于并发操作的支持
 * CAS 包含了三个操作数：
 * ①内存值  V
 * ②预估值  A
 * ③更新值  B
 * 当且仅当 V == A 时， V = B; 否则，不会执行任何操作。
 * 一次一个进程操作，多线程操作，只有一个线程成功！效率高于同步锁，费事的是需要判断错误如何处理；
 */
public class TestAtomicDemo {

    public static void main(String[] args) {

        AtomicDemo ad = new AtomicDemo();
        int serialNumber = ad.getSerialNumber();
        System.out.println(serialNumber + "a");
        System.out.println(ad.serialNumber + "b");

        for (int i = 0; i < 10; i++) {
            // 多线程安全问题，出现重复的数字；写的时候被别人读！产生问题；原子性不能保证
            // i++不安全，volatile也不能保证
            // 包装的值被volatile修饰
            // 原子性：cas算法
            new Thread(ad).start();
        }
    }

}

class AtomicDemo implements Runnable {

//	private volatile int serialNumber = 0;

    public AtomicInteger serialNumber = new AtomicInteger(0);


    @Override
    public void run() {

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }

        System.out.println(getSerialNumber());
    }

    /**
     * 得到然后自增1；
     */
    public int getSerialNumber() {
        return serialNumber.getAndIncrement();
    }


}
