1:线程池是一种多线程处理形式，处理过程中将任务提交到线程池，任务的执行交由线程池来管理。
2:如果每个请求都创建一个线程去处理，那么服务器的资源很快就会被耗尽，
使用线程池可以减少创建和销毁线程的次数，每个工作线程都可以被重复利用，可执行多个任务。
3:如果用生活中的列子来说明，我们可以把线程池当做一个客服团队，
如果同时有1000个人打电话进行咨询，按照正常的逻辑那就是需要1000个客服接听电话，服务客户。
4:现实往往需要考虑到很多层面的东西，比如：资源够不够，招这么多人需要费用比较多。
5:正常的做法就是招100个人成立一个客服中心，当有电话进来后分配没有接听的客服进行服务，
如果超出了100个人同时咨询的话，提示客户等待，稍后处理，
     等有客服空出来就可以继续服务下一个客户，这样才能达到一个资源的合理利用，实现效益的最大化。
     
----------------------------------------------Java中的线程池种类----------------------------------
1:newSingleThreadExecutor：一个单线程的线程池。这个线程池只有一个线程在工作，
也就是相当于单线程串行执行所有任务。如果这个唯一的线程因为异常结束，
						      那么会有一个新的线程来替代它。
						      此线程池保证所有任务的执行顺序按照任务的提交顺序执行。
2:newFixedThreadPool：创建固定大小的线程池。每次提交一个任务就创建一个线程，直到线程达到线程池的最大大小。
线程池的大小一旦达到最大值就会保持不变，
					    如果某个线程因为执行异常而结束，那么线程池会补充一个新线程。

3:newCachedThreadPool：创建一个可缓存的线程池。如果线程池的大小超过了处理任务所需要的线程，
那么就会回收部分空闲的线程，当任务数增加时，
					      此线程池又添加新线程来处理任务。

4:newScheduledThreadPool：此线程池支持定时以及周期性执行任务的需求

5:newWorkStealingPool：是jdk1.8才有的，会根据所需的并行层次来动态创建和关闭线程，通过使用多个队列减少竞争，
底层用的ForkJoinPool来实现的。
					    ForkJoinPool的优势在于，可以充分利用多cpu，多核cpu的优势，
					    把一个任务拆分成多个“小任务”，
					          把多个“小任务”放到多个处理器核心上并行执行；当多个“小任务”执行完成之后，
					          再将这些执行结果合并起来即可。
					          
-------------------------------------------线程池的拒绝策略-------------------------------------
当请求任务不断的过来，而系统此时又处理不过来的时候，我们需要采取的策略是拒绝服务。
RejectedExecutionHandler接口提供了拒绝任务处理的自定义方法的机会。
在ThreadPoolExecutor中已经包含四种处理策略。
1:AbortPolicy策略：该策略会直接抛出异常，阻止系统正常工作
2:CallerRunsPolicy策略：只要线程池未关闭，该策略直接在调用者线程中，运行当前被丢弃的任务
3:DiscardOldestPolicy策略：该策略将丢弃最老的一个请求，也就是即将被执行的任务，并尝试再次提交当前任务
4:DiscardPolicy策略：该策略默默的丢弃无法处理的任务，不予以任何处理
除了JDK默认为什么提供的四种拒绝策略，我们可以根据自己的业务需求去自定义拒绝策略，自定义的方式很简单，直接实现RejectedExecutionHandler接口即可

--------------------------------------------------------------------------------------------
public ThreadPoolExecutor(int corePoolSize,
           int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue) {
           
        this(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue,
             Executors.defaultThreadFactory(), defaultHandler);
             
}    
corePoolSize:核心线程数量，maximumPoolSize最大的线程数量（核心+非核心），
keepAliveTime：非核心线程存活的时间，unit：定义的时间单位
workQueue:核心线程满了，任务就会进入阻塞队列，阻塞队列也满了，就会创建非核心线程

----------------------------------------------------------------------------------------------------------
比如Spring integration中就有一个自定义的拒绝策略CallerBlocksPolicy，将任务插入到队列中，直到队列中有空闲并插入成功的时候，
否则将根据最大等待时间一直阻塞，直到超时

---------------------------------------------execute和submit的区别？-------------------------------------------
在前面的讲解中，我们执行任务是用的execute方法，除了execute方法，还有一个submit方法也可以执行我们提交的任务。
这两个方法有什么区别呢？分别适用于在什么场景下呢？我们来做一个简单的分析:
execute适用于不需要关注返回值的场景，只需要将线程丢到线程池中去执行就可以了;
submit方法适用于需要关注返回值的场景，submit方法的定义如下：
public interface ExecutorService extends Executor {
　　...
　　<T> Future<T> submit(Callable<T> task);
　　<T> Future<T> submit(Runnable task, T result);
　　Future<?> submit(Runnable task);
　　...
}
ExecutorService其子类AbstractExecutorService实现了submit方法,
可以看到无论参数是Callable还是Runnable，
最终都会被封装成RunnableFuture，然后再调用execute执行:
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
Future submit(Runnable task);直接submit一个Runnable是拿不到返回值的，返回值就是null.

--------------------------------五种线程池的使用场景---------------------------------------------------------
newSingleThreadExecutor：一个单线程的线程池，可以用于需要保证顺序执行的场景，并且只有一个线程在执行.

newFixedThreadPool：一个固定大小的线程池，可以用于已知并发压力的情况下，对线程数做限制.

newCachedThreadPool：一个可以无限扩大的线程池，比较适合处理执行时间比较小的任务.

newScheduledThreadPool：可以延时启动，定时启动的线程池，适用于需要多个后台线程执行周期任务的场景.

newWorkStealingPool：一个拥有多个任务队列的线程池，可以减少连接数，创建当前可用cpu数量的线程来并行执行.

----------------------------------线程池的关闭------------------------------------------------------------
1:关闭线程池可以调用shutdownNow和shutdown两个方法来实现.
2:shutdownNow：对正在执行的任务全部发出interrupt()，停止执行，对还未开始执行的任务全部取消，
并且返回还没开始的任务列表.
3:shutdown：当我们调用shutdown后，线程池将不再接受新的任务，但也不会去强制终止已经提交或者正在执行中的任务.
4:还有一些业务场景下需要知道线程池中的任务是否全部执行完成，当我们关闭线程池之后，可以用isTerminated来判断所有的线程是否执行完成，
    千万不要用isShutdown，isShutdown只是返回你是否调用过shutdown的结果。

---------------------------------------自定义线程池----------------------------------------------------------
1:在实际的使用过程中，大部分我们都是用Executors去创建线程池直接使用，如果有一些其他的需求，
比如指定线程池的拒绝策略，阻塞队列的类型，线程名称的前缀等等，
     我们可以采用自定义线程池的方式来解决。
2:如果只是简单的想要改变线程名称的前缀的话可以自定义ThreadFactory来实现，在Executors.new…中有一个ThreadFactory的参数，
     如果没有指定则用的是DefaultThreadFactory。
3:自定义线程池核心在于创建一个ThreadPoolExecutor对象，指定参数
4:下面我们看下ThreadPoolExecutor构造函数的定义：
public ThreadPoolExecutor(int corePoolSize,
                              int maximumPoolSize,
                              long keepAliveTime,
                              TimeUnit unit,
                              BlockingQueue<Runnable> workQueue,
                              ThreadFactory threadFactory,
                              RejectedExecutionHandler handler) ;
	corePoolSize:
		线程池大小，决定着新提交的任务是新开线程去执行还是放到任务队列中，也是线程池的最最核心的参数。一般线程池开始时是没有线程的，
		只有当任务来了并且线程数量小于corePoolSize才会创建线程。
	maximumPoolSize:
		最大线程数，线程池能创建的最大线程数量。
	keepAliveTime:
		在线程数量超过corePoolSize后，多余空闲线程的最大存活时间。
	unit:
		时间单位
	workQueue:
		存放来不及处理的任务的队列，是一个BlockingQueue。
	threadFactory:
		生产线程的工厂类，可以定义线程名，优先级等。
	handler:
		拒绝策略，当任务来不及处理的时候，如何处理, 前面有讲解。
5:了解上面的参数信息后我们就可以定义自己的线程池了，我这边用ArrayBlockingQueue替换了LinkedBlockingQueue，指定了队列的大小，
     当任务超出队列大小之后使用CallerRunsPolicy拒绝策略处理。
6:这样做的好处是严格控制了队列的大小，不会出现一直往里面添加任务的情况，有的时候任务处理的比较慢，任务数量过多会占用大量内存，导致内存溢出。
7:当然你也可以在提交到线程池的入口进行控制，比如用CountDownLatch, Semaphore等。







