package basic.thread.synchronzied;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 22:36
 */
public class SellTicket {
    public static void main(String[] args) {
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();
        new Ticket().start();

    }
}

class Ticket extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            /**一个对象的字节码对象*/
            synchronized (Ticket.class) {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + Thread.currentThread().getName() + "这是第" + ticket + "票" + "还有" + --ticket + ".............");
            }
        }
    }
}
