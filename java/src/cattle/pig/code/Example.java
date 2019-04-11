package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/22 0022 11:22
 */
public class Example extends Thread {
    /**
     * 这个类虽然继承了Thread类，但是并没有真正创建一个线程。
     * 创建一个线程需要覆盖Thread类的run方法，然后调用Thread类的start()方法启动
     * 这里直接调用run()方法并没有创建线程，跟普通方法调用一样，是顺序执行的
     */
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run");
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.run();
        System.out.print("main");
    }

}
