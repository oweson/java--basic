package basic.ocean.threadsafe;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/4 0004 19:45
 */
public class LockTest {
    public static void demo1() {
        Lock lock = new ReentrantLock();
        lock.lock();
        for (int i = 0; i < 10; i++) {
            System.out.println("ppx");

        }
        lock.unlock();
    }

    public static void main(String[] args) {
        /** 1 lock和synchronized的区别
         *
         *
         *
         * synchronized修饰的对象有四种：
         *
         * （1）修饰代码块，作用于调用的对象；
         *
         * （2）修饰方法，作用于调用的对象；
         *
         * （3）修饰静态方法，作用于所有对象；
         *
         * （4）修饰类，作用于所有对象。

         1.lock是jdk 1.5后新增的

         2.synchronized是修饰整个方法，整个代码块。lock可以在任何地方调用lock方法，
         再在想要结束的地方调用unlock()方法

         3.synchronized是java的底层关键字，是在JVM层面上实现，在代码执行异常时，jvm可以自动释放锁定。
         lock是java类，是通过代码实现来处理异常，所以在finanlly里面一定要调用unlock释放锁。

         4.使用synchronized关键字，如果一个线程不释放锁，另一个会一致等待下去。
         使用lock,如果一个线程不释放锁，在等待很长时间后，可以中断等待去做其他事情。*/

        //==========================================
        /** 2 可以看出Lock类加锁确实是对象锁。针对同一个lock对象执行的lock.lock是获得对象监视器的线程才能执行同步代码 其他线程都要等待。
         在这个例子中，加锁，和释放锁都是在try-finally。这样的好处是在任何异常发生的情况下，都能保障锁的释放。*/
        demo1();
        Lock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        Condition condition = lock.newCondition();
        // ==================================================
        // 2 读写锁
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        /**Lock类除了提供了ReentrantLock的锁以外，还提供了ReentrantReadWriteLock的锁。读写锁分成两个锁，一个锁是读锁，一个锁是写锁。
         * 读锁与读锁之间是共享的，读锁与写锁之间是互斥的，写锁与写锁之间也是互斥的。*/
        /**Lock和synchronized的选择

         　　总结来说，Lock和synchronized有以下几点不同：

         　　1）Lock是一个接口，而synchronized是Java中的关键字，synchronized是内置的语言实现；

         　　2）synchronized在发生异常时，会自动释放线程占有的锁，因此不会导致死锁现象发生；而Lock在发生异常时，如果没有主动通过unLock()去释放锁，则很可能造成死锁现象，因此使用Lock时需要在finally块中释放锁；

         　　3）Lock可以让等待锁的线程响应中断，而synchronized却不行，使用synchronized时，等待的线程会一直等待下去，不能够响应中断；

         　　4）通过Lock可以知道有没有成功获取锁，而synchronized却无法办到。

         　　5）Lock可以提高多个线程进行读操作的效率。

         　　在性能上来说，如果竞争资源不激烈，两者的性能是差不多的，而当竞争资源非常激烈时（即有大量线程同时竞争），
         此时Lock的性能要远远优于synchronized。所以说，在具体使用时要根据适当情况选择。*/


    }
}
