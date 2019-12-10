package basic.ocean.asyc;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo1BasicFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(10);
        Future<Integer> f = es.submit(() -> {
            // 1 长时间的异步计算
            // ...
            // 2 然后返回结果
            return 100+100;
        });
        Integer integer = f.get();
        f.cancel(true);
        System.out.println(integer);

    }


}
