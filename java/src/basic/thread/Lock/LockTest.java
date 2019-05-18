package basic.thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 22:33
 */
public class LockTest {
    public static final int demo1(){
        synchronized (LockTest.class){
            Lock lock = new ReentrantLock();
            lock.lock();
            for (int i = 0; i < 10; i++) {


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
