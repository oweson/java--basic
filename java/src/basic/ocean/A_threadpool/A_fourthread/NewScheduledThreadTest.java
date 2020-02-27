package basic.ocean.A_threadpool.A_fourthread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/26 11:26
 * 此线程池支持定时以及周期性执行任务的需求
 */
public class NewScheduledThreadTest {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        scheduledExecutorService.schedule(() ->
                System.out.println("我是三秒钟后执行。。。。"), 3, TimeUnit.SECONDS);
        // 周期执行2s一次，过两秒一次
        scheduledExecutorService.scheduleAtFixedRate(() -> System.out.println("hello"), 2, 2, TimeUnit.SECONDS);
        //scheduledExecutorService.shutdown();

    }

}
