package basic.juc.atguigu.juc02;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 1. ReadWriteLock : 读写锁
 * 写写/读写 需要“互斥”
 * 读读 不需要互斥
 */
public class Demo3ReadWriteLock {

    public static void main(String[] args) {
        ReadWriteLockDemo rw = new ReadWriteLockDemo();
        new Thread(new Runnable() {

            @Override
            public void run() {
                rw.set((int) (Math.random() * 101));
            }
        }, "Write:").start();


        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    rw.get();
                }
            },"读锁！！！").start();
        }
    }

}

class ReadWriteLockDemo {

    private int number = 0;

    private ReadWriteLock lock = new ReentrantReadWriteLock();

    // 1 读
    public void get() {
        lock.readLock().lock();
        // 2 上锁

        try {
            System.out.println(Thread.currentThread().getName() + " : " + number);
        } finally {
            lock.readLock().unlock();
            // 3 释放锁
        }
    }

    // 1 写
    public void set(int number) {
        // 2 上锁
        lock.writeLock().lock();

        try {
            System.out.println(Thread.currentThread().getName());
            this.number = number;
        } finally {
            // 3 释放锁
            lock.writeLock().unlock();
        }
    }
}