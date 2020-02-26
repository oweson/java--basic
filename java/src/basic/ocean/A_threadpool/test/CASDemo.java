package basic.ocean.A_threadpool.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 说明:CAS无锁机制<br/>
 * 创建时间：2018年12月10日 下午10:38:23<br/>
 * @author hhl
 */
public class CASDemo {
	public static void main(String[] args) {
		
		AtomicInteger i = new AtomicInteger();
		i.incrementAndGet();
		
		/**
 			public final int incrementAndGet() {  
		    	for (;;) {  
		        //获取当前值  
		        int current = get();  
		        //设置期望值  
		        int next = current + 1;  
		        //调用Native方法compareAndSet，执行CAS操作  
		        if (compareAndSet(current, next))  
		            //成功后才会返回期望值，否则无线循环  
		            return next;  
		    }  
		 */
		
	}
}
