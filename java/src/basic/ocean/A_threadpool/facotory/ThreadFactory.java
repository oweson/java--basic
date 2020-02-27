package basic.ocean.A_threadpool.facotory;


public class ThreadFactory {
    static ThreadPoolI mdefaultNormalPool;
    // Ĭ�ϵ��̳߳�
    static ThreadPoolI mSelfPool;
    //�Զ�����̳߳�
    static ScheduledThreadPool mScheduledPool;
    //ִ������������̳߳�
    static ThreadPoolI mSinglePool;
    //���̳߳�

    /**
     * ������һ��Ĭ����ͨ���̳߳�
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
     * �Զ������ͨ�̳߳�
     */
    public static ThreadPoolI getSelfPool() {
        return mSelfPool;
    }

    /**
     * ��ʼ���Զ����߳�
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
     * ����һ��ִ��������������̳߳�
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

    //����һ�����̳߳�
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
