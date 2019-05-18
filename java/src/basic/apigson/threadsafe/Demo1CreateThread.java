package basic.apigson.threadsafe;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/4 0004 20:15
 */
public class Demo1CreateThread<Object> implements Callable<Object> {

    @Override
    public Object call() throws Exception {
        System.out.println(Thread.currentThread().getName() + "-->我是通过实现Callable接口通过FutureTask包装器来实现的线程");

        return null;
    }

    public static void main(String[] args) {
        Callable<java.lang.Object> callable = new Demo1CreateThread<java.lang.Object>();
        FutureTask<java.lang.Object> futureTask = new FutureTask<java.lang.Object>(callable);
        Thread thread = new Thread(futureTask);
        System.out.println(Thread.currentThread().getName() + ".......................");
        thread.start();
    }
}
