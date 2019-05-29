package basic.ocean.thread.FourThreadCreate;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/17 0017 17:50
 */
public class CallableTest implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;

        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1 传入实现类的匿名对象
        FutureTask<Integer> futureTask = new FutureTask<>(new CallableTest());
        // 2 FutureTask作为参数传递给线程；
        new Thread(futureTask).start();
        Integer integer = futureTask.get();
        System.out.println(integer);

    }
}
