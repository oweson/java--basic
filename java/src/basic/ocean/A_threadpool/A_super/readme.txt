1:�̳߳���һ�ֶ��̴߳�����ʽ����������н������ύ���̳߳أ������ִ�н����̳߳�������
2:���ÿ�����󶼴���һ���߳�ȥ������ô����������Դ�ܿ�ͻᱻ�ľ���
ʹ���̳߳ؿ��Լ��ٴ����������̵߳Ĵ�����ÿ�������̶߳����Ա��ظ����ã���ִ�ж������
3:����������е�������˵�������ǿ��԰��̳߳ص���һ���ͷ��Ŷӣ�
���ͬʱ��1000���˴�绰������ѯ�������������߼��Ǿ�����Ҫ1000���ͷ������绰������ͻ���
4:��ʵ������Ҫ���ǵ��ܶ����Ķ��������磺��Դ������������ô������Ҫ���ñȽ϶ࡣ
5:����������������100���˳���һ���ͷ����ģ����е绰���������û�н����Ŀͷ����з���
���������100����ͬʱ��ѯ�Ļ�����ʾ�ͻ��ȴ����Ժ���
     ���пͷ��ճ����Ϳ��Լ���������һ���ͻ����������ܴﵽһ����Դ�ĺ������ã�ʵ��Ч�����󻯡�
     
----------------------------------------------Java�е��̳߳�����----------------------------------
1:newSingleThreadExecutor��һ�����̵߳��̳߳ء�����̳߳�ֻ��һ���߳��ڹ�����
Ҳ�����൱�ڵ��̴߳���ִ����������������Ψһ���߳���Ϊ�쳣������
						      ��ô����һ���µ��߳����������
						      ���̳߳ر�֤���������ִ��˳����������ύ˳��ִ�С�
2:newFixedThreadPool�������̶���С���̳߳ء�ÿ���ύһ������ʹ���һ���̣߳�ֱ���̴߳ﵽ�̳߳ص�����С��
�̳߳صĴ�Сһ���ﵽ���ֵ�ͻᱣ�ֲ��䣬
					    ���ĳ���߳���Ϊִ���쳣����������ô�̳߳ػᲹ��һ�����̡߳�

3:newCachedThreadPool������һ���ɻ�����̳߳ء�����̳߳صĴ�С�����˴�����������Ҫ���̣߳�
��ô�ͻ���ղ��ֿ��е��̣߳�������������ʱ��
					      ���̳߳���������߳�����������

4:newScheduledThreadPool�����̳߳�֧�ֶ�ʱ�Լ�������ִ�����������

5:newWorkStealingPool����jdk1.8���еģ����������Ĳ��в������̬�����͹ر��̣߳�ͨ��ʹ�ö�����м��پ�����
�ײ��õ�ForkJoinPool��ʵ�ֵġ�
					    ForkJoinPool���������ڣ����Գ�����ö�cpu�����cpu�����ƣ�
					    ��һ�������ֳɶ����С���񡱣�
					          �Ѷ����С���񡱷ŵ���������������ϲ���ִ�У��������С����ִ�����֮��
					          �ٽ���Щִ�н���ϲ��������ɡ�
					          
-------------------------------------------�̳߳صľܾ�����-------------------------------------
���������񲻶ϵĹ�������ϵͳ��ʱ�ִ���������ʱ��������Ҫ��ȡ�Ĳ����Ǿܾ�����
RejectedExecutionHandler�ӿ��ṩ�˾ܾ���������Զ��巽���Ļ��ᡣ
��ThreadPoolExecutor���Ѿ��������ִ�����ԡ�
1:AbortPolicy���ԣ��ò��Ի�ֱ���׳��쳣����ֹϵͳ��������
2:CallerRunsPolicy���ԣ�ֻҪ�̳߳�δ�رգ��ò���ֱ���ڵ������߳��У����е�ǰ������������
3:DiscardOldestPolicy���ԣ��ò��Խ��������ϵ�һ������Ҳ���Ǽ�����ִ�е����񣬲������ٴ��ύ��ǰ����
4:DiscardPolicy���ԣ��ò���ĬĬ�Ķ����޷���������񣬲������κδ���
����JDKĬ��Ϊʲô�ṩ�����־ܾ����ԣ����ǿ��Ը����Լ���ҵ������ȥ�Զ���ܾ����ԣ��Զ���ķ�ʽ�ܼ򵥣�ֱ��ʵ��RejectedExecutionHandler�ӿڼ���

--------------------------------------------------------------------------------------------
public ThreadPoolExecutor(int corePoolSize,
           int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
           
        this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
             Executors.defaultThreadFactory(), defaultHandler);
             
}    
corePoolSize:�����߳�������maximumPoolSize�����߳�����������+�Ǻ��ģ���
keepAliveTime���Ǻ����̴߳���ʱ�䣬unit�������ʱ�䵥λ
workQueue:�����߳����ˣ�����ͻ�����������У���������Ҳ���ˣ��ͻᴴ���Ǻ����߳�

----------------------------------------------------------------------------------------------------------
����Spring integration�о���һ���Զ���ľܾ�����CallerBlocksPolicy����������뵽�����У�ֱ���������п��в�����ɹ���ʱ��
���򽫸������ȴ�ʱ��һֱ������ֱ����ʱ

---------------------------------------------execute��submit������-------------------------------------------
��ǰ��Ľ����У�����ִ���������õ�execute����������execute����������һ��submit����Ҳ����ִ�������ύ������
������������ʲô�����أ��ֱ���������ʲô�������أ���������һ���򵥵ķ���:
execute�����ڲ���Ҫ��ע����ֵ�ĳ�����ֻ��Ҫ���̶߳����̳߳���ȥִ�оͿ�����;
submit������������Ҫ��ע����ֵ�ĳ�����submit�����Ķ������£�
public interface ExecutorService extends Executor {
����...
����<T> Future<T> submit(Callable<T> task);
����<T> Future<T> submit(Runnable task, T result);
����Future<?> submit(Runnable task);
����...
}
ExecutorService������AbstractExecutorServiceʵ����submit����,
���Կ������۲�����Callable����Runnable��
���ն��ᱻ��װ��RunnableFuture��Ȼ���ٵ���executeִ��:
	/**
    * @throws RejectedExecutionException {@inheritDoc}
    * @throws NullPointerException       {@inheritDoc}
    */
   public Future<?> submit(Runnable task) {
       if (task == null) throw new NullPointerException();
       RunnableFuture<Void> ftask = newTaskFor(task, null);
       execute(ftask);
       return ftask;
   }
   /**
    * @throws RejectedExecutionException {@inheritDoc}
    * @throws NullPointerException       {@inheritDoc}
    */
   public <T> Future<T> submit(Runnable task, T result) {
       if (task == null) throw new NullPointerException();
       RunnableFuture<T> ftask = newTaskFor(task, result);
       execute(ftask);
       return ftask;
   }
   /**
    * @throws RejectedExecutionException {@inheritDoc}
    * @throws NullPointerException       {@inheritDoc}
    */
   public <T> Future<T> submit(Callable<T> task) {
       if (task == null) throw new NullPointerException();
       RunnableFuture<T> ftask = newTaskFor(task);
       execute(ftask);
       return ftask;
   }
   
submit(Callable task);
submit(Runnable task, T result);
Future submit(Runnable task);ֱ��submitһ��Runnable���ò�������ֵ�ģ�����ֵ����null.

--------------------------------�����̳߳ص�ʹ�ó���---------------------------------------------------------
newSingleThreadExecutor��һ�����̵߳��̳߳أ�����������Ҫ��֤˳��ִ�еĳ���������ֻ��һ���߳���ִ��.

newFixedThreadPool��һ���̶���С���̳߳أ�����������֪����ѹ��������£����߳���������.

newCachedThreadPool��һ����������������̳߳أ��Ƚ��ʺϴ���ִ��ʱ��Ƚ�С������.

newScheduledThreadPool��������ʱ��������ʱ�������̳߳أ���������Ҫ�����̨�߳�ִ����������ĳ���.

newWorkStealingPool��һ��ӵ�ж��������е��̳߳أ����Լ�����������������ǰ����cpu�������߳�������ִ��.

----------------------------------�̳߳صĹر�------------------------------------------------------------
1:�ر��̳߳ؿ��Ե���shutdownNow��shutdown����������ʵ��.
2:shutdownNow��������ִ�е�����ȫ������interrupt()��ִֹͣ�У��Ի�δ��ʼִ�е�����ȫ��ȡ����
���ҷ��ػ�û��ʼ�������б�.
3:shutdown�������ǵ���shutdown���̳߳ؽ����ٽ����µ����񣬵�Ҳ����ȥǿ����ֹ�Ѿ��ύ��������ִ���е�����.
4:����һЩҵ�񳡾�����Ҫ֪���̳߳��е������Ƿ�ȫ��ִ����ɣ������ǹر��̳߳�֮�󣬿�����isTerminated���ж����е��߳��Ƿ�ִ����ɣ�
    ǧ��Ҫ��isShutdown��isShutdownֻ�Ƿ������Ƿ���ù�shutdown�Ľ����

---------------------------------------�Զ����̳߳�----------------------------------------------------------
1:��ʵ�ʵ�ʹ�ù����У��󲿷����Ƕ�����Executorsȥ�����̳߳�ֱ��ʹ�ã������һЩ����������
����ָ���̳߳صľܾ����ԣ��������е����ͣ��߳����Ƶ�ǰ׺�ȵȣ�
     ���ǿ��Բ����Զ����̳߳صķ�ʽ�������
2:���ֻ�Ǽ򵥵���Ҫ�ı��߳����Ƶ�ǰ׺�Ļ������Զ���ThreadFactory��ʵ�֣���Executors.new������һ��ThreadFactory�Ĳ�����
     ���û��ָ�����õ���DefaultThreadFactory��
3:�Զ����̳߳غ������ڴ���һ��ThreadPoolExecutor����ָ������
4:�������ǿ���ThreadPoolExecutor���캯���Ķ��壺
public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler) ;
	corePoolSize:
		�̳߳ش�С�����������ύ���������¿��߳�ȥִ�л��Ƿŵ���������У�Ҳ���̳߳ص�������ĵĲ�����һ���̳߳ؿ�ʼʱ��û���̵߳ģ�
		ֻ�е��������˲����߳�����С��corePoolSize�Żᴴ���̡߳�
	maximumPoolSize:
		����߳������̳߳��ܴ���������߳�������
	keepAliveTime:
		���߳���������corePoolSize�󣬶�������̵߳������ʱ�䡣
	unit:
		ʱ�䵥λ
	workQueue:
		������������������Ķ��У���һ��BlockingQueue��
	threadFactory:
		�����̵߳Ĺ����࣬���Զ����߳��������ȼ��ȡ�
	handler:
		�ܾ����ԣ������������������ʱ����δ���, ǰ���н��⡣
5:�˽�����Ĳ�����Ϣ�����ǾͿ��Զ����Լ����̳߳��ˣ��������ArrayBlockingQueue�滻��LinkedBlockingQueue��ָ���˶��еĴ�С��
     �����񳬳����д�С֮��ʹ��CallerRunsPolicy�ܾ����Դ���
6:�������ĺô����ϸ�����˶��еĴ�С���������һֱ��������������������е�ʱ��������ıȽ������������������ռ�ô����ڴ棬�����ڴ������
7:��Ȼ��Ҳ�������ύ���̳߳ص���ڽ��п��ƣ�������CountDownLatch, Semaphore�ȡ�







