package pig.zhongwang;

/**
 * @author chengwanli
 * @date 2020/10/16 22:25
 */


public class ManyThreadTest implements Runnable {
  static   int total = 0;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            total += i;

        }
        System.out.println(total+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
       // new Thread(new ManyThreadTest()).start();
        new Thread(new ManyThreadTest()).start();
        System.out.println(Thread.currentThread().getName()+total);

    }
}
