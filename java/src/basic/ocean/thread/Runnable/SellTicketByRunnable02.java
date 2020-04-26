package basic.ocean.thread.Runnable;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 22:46
 */
public class SellTicketByRunnable02 {
    public static void main(String[] args) {
        Train train = new Train();
        new Thread(train).start();
        new Thread(train).start();
        new Thread(train).start();
        new Thread(train).start();
        new Thread(train).start();
        new Thread(train).start();

    }
}

class Train implements Runnable {
    static int ticket = 100;
    @Override
    public void run() {
        while (true) {
            // 类锁
            synchronized (Train.class) {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(13);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "这是第" + ticket + "票"
                        + "还有" + --ticket + ".............");
            }
        }
    }
}
