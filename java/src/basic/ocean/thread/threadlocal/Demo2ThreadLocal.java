package basic.ocean.thread.threadlocal;

import java.util.concurrent.CountDownLatch;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/30 0030 16:48
 */
public class Demo2ThreadLocal {
    /**
     * 从结果来看，这次我们很好的解决了多线程之间数据隔离的问题，十分方便。
     * 这里可能有的朋友会觉得在例子 1 中我们完全可以通过加锁来实现这个功能。是的没错，加锁确实可以解决这个问题，
     * 但是在这里我们强调的是线程数据隔离的问题，并不是多线程共享数据的问题。假如我们这里除了getString()
     * 之外还有很多其他方法也要用到这个 String，这个时候各个方法之间就没有显式的数据传递过程了，都可以直接中 ThreadLocal 变量中获取，这才是 ThreadLocal 的核心，相同线程数据共享不同的线程数据隔离。
     * 由于ThreadLocal 是支持泛型的，这里采用的是存放一个 String 来演示，其实可以存放任何类型，效果都是一样的。
     * ThreadLocal 源码分析
     * 在分析源码前我们明白一个事那就是对象实例与 ThreadLocal 变量的映射关系是由线程 Thread 来维护的，
     * 对象实例与 ThreadLocal 变量的映射关系是由线程 Thread 来维护的，对象实例与 ThreadLocal 变量的映射关系是由线程
     * Thread 来维护的。重要的事情说三遍。换句话说就是对象实例与
     * ThreadLocal 变量的映射关系是存放的一个 Map 里面（这个 Map 是个抽象的 Map 并不是 java.util 中的 Map ），
     * 而这个 Map 是 Thread 类的一个字段！而真正存放映射关系的 Map 就是 ThreadLocalMap。
     */
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    private String getString() {
        return threadLocal.get();
    }

    private void setString(String string) {
        threadLocal.set(string);
    }

    public static void main(String[] args) {
        int threads = 9;
        Demo2ThreadLocal demo = new Demo2ThreadLocal();
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        for (int i = 0; i < threads; i++) {
            Thread thread = new Thread(() -> {
                demo.setString(Thread.currentThread().getName());
                System.out.println(demo.getString());
                countDownLatch.countDown();
            }, "thread - " + i);
            thread.start();
        }
    }
}
