package basic.ocean.A_threadpool.facotory;

import java.util.concurrent.Future;

public interface ThreadPoolI {

    /**
     * 1提交任务，获取任务的执行情况
     */
    public Future<?> submit(Runnable task);

    /**
     * 2 执行任务，不关心任务的执行情况
     */
    public void execute(Runnable task);

    /**
     * 3反射执行任务,不带参数
     */
    public void execute(Object obj, String methodName);

    /**
     * 4提交反射任务，不带参数
     */
    public Future<?> submit(Object obj, String methodName);

    /**
     * 5反射执行任务，带参数
     */
    public void execute(Object obj, String methodName, Object... parameters);

    /**
     * 6 反射提交任务，带参数
     */
    public Future<?> submit(Object obj, String methodName, Object... parameters);

    /**
     * 7 停止任务
     */
    public boolean stopTask(Future<?> future);

}
