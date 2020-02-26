package basic.ocean.A_threadpool.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * ˵��:��д��<br/>
 * ����ʱ�䣺2018��12��10�� ����10:17:20<br/>
 * @author hhl
 */
public class ReentrantReadWriteLockDemo {
	static Map<String, Object> map = new HashMap<String, Object>();
	static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	static Lock r = rwl.readLock();
	static Lock w = rwl.writeLock();

	// ��ȡһ��key��Ӧ��value
	public static final Object get(String key) {
		r.lock();
		try {
			System.out.println("���������Ĳ���,key:" + key + " ��ʼ");
			Thread.sleep(100);
			Object object = map.get(key);
			System.out.println("���������Ĳ���,key:" + key + " ����\n");
			return object;
		} catch (InterruptedException e) {

		} finally {
			r.unlock();
		}
		return key;
	}

	// ����key��Ӧ��value�������ؾ��е�value
	public static final Object put(String key, Object value) {
		w.lock();
		try {
			System.out.println("������д�Ĳ���,key:" + key + ",value:" + value + "��ʼ.");
			Thread.sleep(100);
			Object object = map.put(key, value);
			System.out.println("������д�Ĳ���,key:" + key + ",value:" + value + "����.");
			System.out.println();
			return object;
		} catch (InterruptedException e) {

		} finally {
			w.unlock();
		}
		return value;
	}

	// ������е�����
	public static final void clear() {
		w.lock();
		try {
			map.clear();
		} finally {
			w.unlock();
		}
	}

	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					ReentrantReadWriteLockDemo.put(i + "", i + "");
				}
			}
		}).start();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					ReentrantReadWriteLockDemo.get(i + "");
				}
			}
		}).start();
	}
}
