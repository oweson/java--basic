package eclipse.mar.thread;

import java.util.Objects;

/**
 * @Author:oweson
 * @Date :2018/5/27 0027 21:46
 * @色厉而胆薄，好谋而寡断
 */

public class SleepTest extends Thread {
    int name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SleepTest lastTime = (SleepTest) o;
        return name == lastTime.name;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public SleepTest(int name) {
        this.name = name;
    }
    public SleepTest() {
    }


    public static void main(String[] args) throws InterruptedException {
        new SleepTest().start();

        for (int i = 0; i < 10; i++) {
            // 不释放对象锁；
            Thread.sleep(1000);
            System.out.println(i);


        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }
}
