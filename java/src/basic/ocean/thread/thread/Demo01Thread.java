package basic.ocean.thread.thread;

/**
 * @Author:oweson
 * @Date :2018/5/27 0027 21:40
 * @色厉而胆薄，好谋而寡断
 */
public class Demo01Thread extends Thread {
    /**
     * 创建多线程程序的第一种方式:创建Thread类的子类
     * java.lang.Thread类:是描述线程的类,我们想要实现多线程程序,就必须继承Thread类
     * 实现步骤:
     * 1.创建一个Thread类的子类
     * 2.在Thread类的子类中重写Thread类中的run方法,设置线程任务(开启线程要做什么?)
     * 3.创建Thread类的子类对象
     * 4.调用Thread类中的方法start方法,开启新的线程,执行run方法
     * void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
     * 结果是两个线程并发地运行；当前线程（main线程）和另一个线程（创建的新线程,执行其 run 方法）。
     * 多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
     * java程序属于抢占式调度,那个线程的优先级高,那个线程优先执行;同一个优先级,随机选择一个执行
     */
    public static void main(String[] args) {
        /*
         主线程:执行主(main)方法的线程

        单线程程序:java程序中只有一个线程
         执行从main方法开始,从上到下依次执行

         JVM执行main方法,main方法会进入到栈内存
         JVM会找操作系统开辟一条main方法通向cpu的执行路径
         cpu就可以通过这个路径来执行main方法
         而这个路径有一个名字,叫main(主)线程
         */
        //3.创建Thread类的子类对象
        //4.调用Thread类中的方法start方法,开启新的线程,执行run方法
        new Demo01Thread().start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是一只猪！");
            }
        }).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }
}
