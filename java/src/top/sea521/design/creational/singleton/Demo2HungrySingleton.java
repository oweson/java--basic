package top.sea521.design.creational.singleton;

import java.io.Serializable;

/**
 * Created by geely
 */
public class Demo2HungrySingleton implements Serializable, Cloneable {

    private  static Demo2HungrySingleton hungrySingleton;

    /**类加载的时候就生成对象；
     * 反射调用抛出异常；*/

    static {
        hungrySingleton = new Demo2HungrySingleton();
    }

    private Demo2HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static Demo2HungrySingleton getInstance() {
        return hungrySingleton;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
