package basic.ocean.A_threadpool.test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * ˵��:CAS��������<br/>
 * ����ʱ�䣺2018��12��10�� ����10:38:23<br/>
 * @author hhl
 */
public class CASDemo {
	public static void main(String[] args) {
		
		AtomicInteger i = new AtomicInteger();
		i.incrementAndGet();
		
		/**
 			public final int incrementAndGet() {  
		    	for (;;) {  
		        //��ȡ��ǰֵ  
		        int current = get();  
		        //��������ֵ  
		        int next = current + 1;  
		        //����Native����compareAndSet��ִ��CAS����  
		        if (compareAndSet(current, next))  
		            //�ɹ���Ż᷵������ֵ����������ѭ��  
		            return next;  
		    }  
		 */
		
	}
}
