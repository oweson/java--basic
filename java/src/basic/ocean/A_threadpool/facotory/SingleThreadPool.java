package basic.ocean.A_threadpool.facotory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//单线程的线程池
public class SingleThreadPool extends AbstractThreadPool{
	
	private ExecutorService executorService;

    public SingleThreadPool(){
        executorService = Executors.newSingleThreadExecutor();
    }

	@Override
	public Future<?> submit(Runnable task) {
		return this.executorService.submit(task);
	}

	@Override
	public void execute(Runnable task) {
		this.executorService.execute(task);
	}


}
