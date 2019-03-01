package eclipse.mar.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 21:14
 */
public class ThreadSafeSaleTicket {
    public static void main(String[] args) {
        Ticket02 ticket02 = new Ticket02();
        Thread thread = new Thread(ticket02);
        Thread thread02 = new Thread(ticket02);
        Thread thread03 = new Thread(ticket02);
        thread.start();
        thread02.start();
        thread03.start();

    }
}

class Ticket02 implements Runnable {
    public int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    /** 窗口卖出票，休闲......*/
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 票存在
                System.out.println(Thread.currentThread().getName() + "正在出售" + "第" + ticket + "票");
                ticket--;
            }
        }

    }
}
