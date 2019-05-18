package basic.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月25日 下午8:41:58 类说明：侵权必究。。。。。。。
 */

public class ReflactToLover {
    int age = 21;

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
            InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> forName = Class.forName("com.how2java.reflect.ReflactToLover");
        Constructor constructor = forName.getConstructor();
        ReflactToLover newInstance = (ReflactToLover) constructor.newInstance();
        newInstance.age = 211;
        // 反射得到对象；
        // 设置的时候无需set和get直接对象.进行调用；
        System.out.println(newInstance.age);
    }

}
