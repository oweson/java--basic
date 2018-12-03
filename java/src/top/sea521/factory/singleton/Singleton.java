package top.sea521.factory.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 19:45
 */
public class Singleton {
    private volatile static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
