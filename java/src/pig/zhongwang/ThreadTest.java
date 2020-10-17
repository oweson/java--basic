package pig.zhongwang;

/**
 * @author chengwanli
 * @date 2020/10/14 23:10
 */


public class ThreadTest extends Thread{
    @Override
    public void run() {
        System.out.println("thread start!");
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        // java.lang.IllegalThreadStateException
        threadTest.start();
        /**Java的线程是不允许启动两次的，第二次调用必然会抛出IllegalThreadStateException，这是一种运行时异常;
         * 在第二次调用start()方法的时候，线程可能处于终止或者其他（非NEW）状态，但是不论如何，都是不可以再次启动的。;
         * */


    }
}
