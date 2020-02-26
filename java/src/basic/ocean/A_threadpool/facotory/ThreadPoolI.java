package basic.ocean.A_threadpool.facotory;

import java.util.concurrent.Future;

public interface ThreadPoolI {

    /**
     * 1�ύ���񣬻�ȡ�����ִ�����
     */
    public Future<?> submit(Runnable task);

    /**
     * 2 ִ�����񣬲����������ִ�����
     */
    public void execute(Runnable task);

    /**
     * 3����ִ������,��������
     */
    public void execute(Object obj, String methodName);

    /**
     * 4�ύ�������񣬲�������
     */
    public Future<?> submit(Object obj, String methodName);

    /**
     * 5����ִ�����񣬴�����
     */
    public void execute(Object obj, String methodName, Object... parameters);

    /**
     * 6 �����ύ���񣬴�����
     */
    public Future<?> submit(Object obj, String methodName, Object... parameters);

    /**
     * 7 ֹͣ����
     */
    public boolean stopTask(Future<?> future);

}
