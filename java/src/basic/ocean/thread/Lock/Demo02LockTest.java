package basic.ocean.thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 22:33
 */
public class Demo02LockTest {
    public static final int demo1(){
        synchronized (Demo02LockTest.class){
            // 在有安全风险的地方用lock接口
            Lock lock = new ReentrantLock();
            lock.lock();
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            lock.unlock();

        }
        return 0;
    }
    public static void main(String[] args) {
        demo1();
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
}
