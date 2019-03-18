package eclipse.mar.thread.FourThreadCreate;

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
        FutureTask<Integer> futureTask = new FutureTask<>(new CallableTest());
        new Thread(futureTask).start();
        Integer integer = futureTask.get();
        System.out.println(integer);

    }
}
