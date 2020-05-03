package basic.lake;

public class Demo3_Volatile {
    public static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {
                // do sth
            }
            System.out.println("进来了！");

        }, "server") {
        }.start();
        Thread.sleep(1000);
        // volatile 修饰让另一个线程可见；
        flag = false;
    }
}
