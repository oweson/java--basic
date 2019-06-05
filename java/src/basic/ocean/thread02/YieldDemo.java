package basic.ocean.thread02;

public class YieldDemo {
    public static void main(String[] args) {
        Runnable yieldTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                    // a 线程运行到5的时候就让出线程给b运行
                    // 只是暗示不一定让出！；
                    if (i == 5) {
                        Thread.yield();
                    }
                }
            }
        };
        //thread有待参数的构造器和无参数的构造器
        Thread t1 = new Thread(yieldTask, "A");
        Thread t2 = new Thread(yieldTask, "B");
        t1.start();
        t2.start();
    }

}
