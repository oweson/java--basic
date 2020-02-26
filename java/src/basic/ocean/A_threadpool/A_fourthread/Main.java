package basic.ocean.A_threadpool.A_fourthread; /**
 * Created by Administrator on 2016/10/13.
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Administrator 2016/10/13
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        final List<String> list = new ArrayList<String>();
        final List<Future<String>> resultList = new ArrayList<Future<String>>();
        for (int i = 0; i < 5; i++) {
            final Future<String> future=cachedThreadPool.submit(new Callable<String>() {
                public String call() throws Exception {
                    list.add(new Date()+Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getName()+"   sleep");
                    Thread.sleep(5*1000);
                    return "";
                }
            });
            resultList.add(future);
        }
        System.out.println("========================================");
        //遍历任务的结果
        for (Future<String> fs : resultList){
            try{
                while(!fs.isDone());
                //Future返回如果没有完成，则一直循环等待，直到Future返回完成
                System.out.println(fs.get()+"\n");
                //打印各个线程（任务）执行的结果
            }catch(InterruptedException e){
                e.printStackTrace();
            }catch(ExecutionException e){
                e.printStackTrace();
            }finally{
                //启动一次顺序关闭，执行以前提交的任务，但不接受新任务
                cachedThreadPool.shutdown();
            }
        }
        System.out.println(list);
    }
}
