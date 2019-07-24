package pig.suzhouyinneng;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 18:05
 */
public class Pig {
    private Pig() {
        if (pig != null) {
            throw new RuntimeException("禁止反射调用！！！");
        }
    }

    private volatile static Pig pig = null;

    public static Pig getOnePig() {
        if (pig == null) {
            synchronized (Pig.class) {
                if (pig == null) {
                    // 双重检验加锁，生成新的对象赋予引用，返回；
                    pig = new Pig();
                }
            }

        }
        return pig;
    }
}
