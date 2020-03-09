package basic.ocean.thread.wait;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/3/6 16:56
 */
public class Rabbit01 implements  Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (MyLock.o){
                System.out.println("1");
                MyLock.o.notify();
                try {
                    MyLock.o.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
