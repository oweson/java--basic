package basic.ocean.thread.getName;

/**
 * 线程的名称:
 * 主线程: main
 * 新线程: Thread-0,Thread-1,Thread-2
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        // 1 创建Thread类的子类对象
        MyThread mt = new MyThread();
        // 2 调用start方法,开启新线程,执行run方法
        mt.start();

        new MyThread().start();

        // 3 链式编程
        System.out.println("======================================================");
        System.out.println(Thread.currentThread().getName());
        // ======================================================
        //main
        //Thread-0
        //Thread-1
    }
}
