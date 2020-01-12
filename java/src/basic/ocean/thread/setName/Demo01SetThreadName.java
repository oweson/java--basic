package basic.ocean.thread.setName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        // 1 开启多线程
        MyThread mt = new MyThread();
        mt.setName("小强");
        mt.start();

        // 2 开启多线程
        new MyThread("旺财").start();
        System.out.println("Current Thread: " + Thread.currentThread().getName());

    }
}
