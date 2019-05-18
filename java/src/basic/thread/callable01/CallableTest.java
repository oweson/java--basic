package basic.thread.callable01;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/2 0002 20:39
 */
public class CallableTest implements Callable {
    @Override
    public Object call() throws Exception {
        return 123;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableTest callableTest = new CallableTest();
        FutureTask futureTask = new FutureTask(callableTest);
        Object o = futureTask.get();
        System.out.println(o);
    }
}
