package top.sea521.factory.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/29 0029 14:45
 */
public class Hungry {
    /**
     * 1 饿汉模式！
     */
    private static Hungry hugry;

    static {
        hugry = new Hungry();
    }

    public static Hungry genInstance() {
        return hugry;
    }
}
