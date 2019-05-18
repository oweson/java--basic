package basic.thread.Lock;

import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/18 0018 9:33
 */
public class Fish {
    Date d = new Date();

    public void say() {
        synchronized (d) {
            System.out.print("我");
            System.out.print("是");
            System.out.print("中");
            System.out.print("华");
            System.out.println("浔");
            System.out.println("---------------------------");
        }
    }

    public void eat() {
        synchronized (d) {
            System.out.print("洗");
            System.out.print("欢");
            System.out.print("喝");
            System.out.println("水");
            System.out.println("==============================");
        }
    }
}
