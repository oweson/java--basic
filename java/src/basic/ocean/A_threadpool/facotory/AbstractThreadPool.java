package basic.ocean.A_threadpool.facotory;

import java.lang.reflect.Method;
import java.util.concurrent.Future;

public abstract class AbstractThreadPool implements ThreadPoolI{
	
	//����ִ������,��������
	public void execute(Object obj,String methodName){
		execute(constructRunnable(obj,methodName));
	}
	
	@Override
	public void execute(Object obj, String methodName, Object... parameters) {
		execute(constructRunnable(obj,methodName,parameters));
	}
	

	@Override
	public Future<?> submit(Object obj, String methodName, Object... parameters) {
		return submit(constructRunnable(obj,methodName,parameters));
	}

	//�ύ�������񣬲�������
	public Future<?> submit(Object obj,String methodName){
		return submit(constructRunnable(obj,methodName));
	}
	
	//ֹͣ����
	public boolean stopTask(Future<?> future){
		if(future.isCancelled()){
			return true;
		}else{
			return future.cancel(true);
		}
	}
	
	//�����޲κ���Runnable
	private Runnable constructRunnable(final Object obj,final String methodName){
        Runnable task = new Runnable() {
			
			@Override
			public void run() {
				try{
				    Method m = obj.getClass().getMethod(methodName);
				    m.invoke(obj);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		};
		return task;
	}
	
	//�����вκ���Runnable
	private Runnable constructRunnable(final Object obj,final String methodName,final Object... parameters){
		
        Runnable task = new Runnable() {
			
			@Override
			public void run() {
				try{
					Class<?>[] parametersType = new Class<?>[parameters.length];
					for(int i=0;i<parameters.length;i++){
						parametersType[i] = parameters[i].getClass();
					}
				    Method m = obj.getClass().getMethod(methodName,parametersType);
			        m.invoke(obj,parameters);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		};
		return task;
	}
	

}
