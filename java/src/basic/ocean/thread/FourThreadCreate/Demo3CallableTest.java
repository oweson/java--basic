package basic.ocean.thread.FourThreadCreate;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo3CallableTest implements Callable {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;

        }
        System.out.println(Thread.currentThread().getName());
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Demo3CallableTest demo3CallableTest = new Demo3CallableTest();
        FutureTask<Integer> futureTask = new FutureTask<>(demo3CallableTest);
        new Thread(futureTask).start();
        Integer integer = futureTask.get();
        System.out.println(integer);


    }
}
