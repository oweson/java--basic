package basic.juc.atguigu.juc02;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/1/11 10:13
 */
public class BigPig {
    public static void main(String[] args) {
        SmallPig smallPig = new SmallPig();
        new Thread(smallPig, "北京站").start();
        new Thread(smallPig, "广州站").start();
        new Thread(smallPig, "上海站").start();

    }

}

class SmallPig implements Runnable {
    private int ticket = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (ticket < 0) {
                System.out.println("火车票卖完了！！！");
                break;
            }
            try {
                Thread.sleep(21);
                System.out.println(Thread.currentThread().getName() + "售卖票，  还剩余   ：" + --ticket);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }


        }


    }
}
