package basic.ocean.thread.threadlocal;

import java.util.concurrent.CountDownLatch;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/30 0030 16:45
 */
public class Demo1ThreadLocal {
    /**ThreadLocal 这个类提供线程局部变量，这些变量与其他正常的变量的不同之处在于，
     * 每一个访问该变量的线程在其内部都有一个独立的初始化的变量副本
     * ThreadLocal 实例变量通常采用private static在类中修饰。
     只要 ThreadLocal 的变量能被访问，并且线程存活，那每个线程都会持有 ThreadLocal 变量的副本。
     当一个线程结束时，它所持有的所有 ThreadLocal 相对的实例副本都可被回收。
     一句话说就是 ThreadLocal 适用于每个线程需要自己独立的实例且该实例需要在多个方法中被使用（相同线程数据共享），
     也就是变量在线程间隔离（不同的线程数据隔离）而在方法或类间共享的场景。*/
    private String string;

    private String getString() {
        return string;
    }

    private void setString(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        int threads = 9;
        Demo1ThreadLocal demo = new Demo1ThreadLocal();
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
