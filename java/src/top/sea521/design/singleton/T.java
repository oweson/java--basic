package top.sea521.design.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 19:49
 */
public class T implements Runnable {

    @Override
    public void run() {
        Singleton singleton = Singleton.getSingleton();
        System.out.println(Thread.currentThread().getName()+"   "+singleton);
    }
}
