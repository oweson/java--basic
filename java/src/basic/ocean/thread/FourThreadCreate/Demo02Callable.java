package basic.ocean.thread.FourThreadCreate;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/29 0029 14:56
 */
public class Demo02Callable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return 100;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Demo02Callable demo02Callable = new Demo02Callable();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(demo02Callable);
        new Thread(futureTask).start();
        Integer integer = futureTask.get();
        System.out.println("返回值是：   " + integer);
    }
}
