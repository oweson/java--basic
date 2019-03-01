package eclipse.mar.thread.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 22:33
 */
public class LockTest {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
    }
}
