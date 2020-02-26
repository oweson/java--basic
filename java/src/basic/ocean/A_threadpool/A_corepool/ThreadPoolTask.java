package basic.ocean.A_threadpool.A_corepool;

import java.io.Serializable;

/**
 * 任务执行
 * @author devinlee
 */
public class ThreadPoolTask implements Runnable, Serializable {

    private Object attachData;

    ThreadPoolTask(Object tasks) {
        this.attachData = tasks;
    }

    @Override
    public void run(){

        try {
            //业务
            System.out.println("开始执行任务：" + attachData + "任务，使用的线程池，线程名称：" + Thread.currentThread().getName());
            System.out.println();

        } catch (Exception e) {

            e.printStackTrace();
        }

        attachData = null;
    }

}
