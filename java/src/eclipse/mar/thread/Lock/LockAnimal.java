package eclipse.mar.thread.Lock;

import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 22:17
 */
public class LockAnimal {
    public static void main(String[] args) {
        Date date = new Date();
        final Fish fish = new Fish();
        new Thread() {
            @Override
            public void run() {


                while (true) {
                    fish.eat();
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                while (true) {
                    fish.say();

                }
            }
        }.start();
    }
}



