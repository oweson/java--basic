package basic.ocean.thread.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/15 0015 9:39
 */
public class Demo4Thread {


    public static void main(String[] args) {
        Runnable runnable  = new Runnable() {
            @Override
            public void run() {
                System.out.println("foo");
            }
        };
        Thread thread =  new Thread(runnable);
        /* 调用的是自己没有重写的run()*/
        // todo 切记，唯有start才会开启线程！！！
        thread.run();
        System.out.println("bar");
        System.out.println("-----------------------");
        thread.start();
        System.out.println("-----------------------------------------------------------");
        String s=null;
        System.out.print(s+"hello");
    }
}
