package top.sea521.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/10 0010 14:38
 */
public class MySingleton {
    private static volatile MySingleton mySingleton = null;

    private MySingleton() {
    }

    public static MySingleton getMySingleton() {
        if (mySingleton == null) {
            synchronized (MySingleton.class) {
                if (mySingleton == null) {
                    mySingleton = new MySingleton();
                }
            }
        }
        return mySingleton;
    }
}
