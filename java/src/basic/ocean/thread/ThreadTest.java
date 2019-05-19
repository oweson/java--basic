package basic.ocean.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/15 0015 9:39
 */
public class ThreadTest {


    public static void main(String[] args) {
        Runnable runnable  = new Runnable() {
            @Override
            public void run() {
                System.out.println("foo");
            }
        };
        Thread thread =  new Thread(runnable);
        /** 调用的是自己没有重写的run()*/
        thread.run();
        System.out.println("bar");
        System.out.println("-----------------------");
        thread.start();
        System.out.println("-----------------------------------------------------------");
        String s=null;
        System.out.print(s+"hello");
    }
}
