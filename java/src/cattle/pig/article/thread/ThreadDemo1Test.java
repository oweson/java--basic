package cattle.pig.article.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:18
 */
public class ThreadDemo1Test {
    /** 1 下列关于JAVA多线程的叙述正确的是（）

     正确答案: B C   你的答案: C D
     调用start()方法和run()都可以启动一个线程
     CyclicBarrier和CountDownLatch都可以让一组线程等待其他线程
     Callable类的call()方法可以返回值和抛出异常
     新建的线程调用start()方法就能立即进行运行状态

     解析：A. start()方法来启动线程，真正实现了多线程运行，调用了run()方法；
     run()方法当作普通方法的方式调用。
     B. CyclicBarrier让一组线程等待其他线程；
     CountDownLatch让一组线程等待某个事件发生。
     C. Callable能够抛出checked exception。
     D. start()方法让thread进去可运行状态（runnable），等待获取CPU的使用权。*/
}
