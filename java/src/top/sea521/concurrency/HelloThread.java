
package top.sea521.concurrency;


public class HelloThread extends Thread {
	
	public void run() {
        System.out.println("Hello from a thread!");
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		(new HelloThread()).start();
	}
}
