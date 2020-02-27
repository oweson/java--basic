package basic.ocean.A_threadpool.facotory;


public class ThreadFactory {
    static ThreadPoolI mdefaultNormalPool;
    // 默认的线程池
    static ThreadPoolI mSelfPool;
    //自定义的线程池
    static ScheduledThreadPool mScheduledPool;
    //执行周期任务的线程池
    static ThreadPoolI mSinglePool;
    //单线程池

    /**
     * 创建了一个默认普通的线程池
     */
    public static ThreadPoolI getDefaultNormalPool() {
        if (mdefaultNormalPool == null) {
            synchronized (ThreadFactory.class) {
                if (mdefaultNormalPool == null) {
                    mdefaultNormalPool = new ThreadPoolProxy(5, 10, 3000);
                }
            }
        }
        return mdefaultNormalPool;
    }

    /**
     * 自定义的普通线程池
     */
    public static ThreadPoolI getSelfPool() {
        return mSelfPool;
    }

    /**
     * 初始化自定义线程
     */
    public static boolean initSelfPool(int corePoolSize, int maximumPoolSize, long keepAliveTime) {
        if (mSelfPool == null) {
            synchronized (ThreadFactory.class) {
                if (mSelfPool == null) {
                    mSelfPool = new ThreadPoolProxy(corePoolSize, maximumPoolSize, keepAliveTime);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 创建一个执行周期性任务的线程池
     */
    public static ScheduledThreadPool getScheduledPool() {
        if (mScheduledPool == null) {
            synchronized (ScheduledThreadPool.class) {
                if (mScheduledPool == null) {
                    mScheduledPool = new ScheduledThreadPool(5);
                }
            }
        }
        return mScheduledPool;
    }

    //创建一个单线程池
    public static ThreadPoolI getSinglePool() {
        if (mSinglePool == null) {
            synchronized (SingleThreadPool.class) {
                if (mSinglePool == null) {
                    mSinglePool = new SingleThreadPool();
                }
            }
        }
        return mSinglePool;
    }

}
