package basic.reflect;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月25日 下午8:14:50 类说明：侵权必究。。。。。。。
 */

/**
 * 类对象概念： 所有的类，都存在一个类对象，这个类对象用于提供类本身的信息，
 * 比如有几种构造方法， 有多少属性，有哪些普通方法。
 */
public class Demo1 {
    /**
     * 然后说说类之间的区别 Hero和Item都是类，他们的区别在于有不同的方法，不同的属性。
     * <p>
     * 类对象，就是用于描述这种类，都有什么属性，什么方法的
     */
    public static void main(String[] args) throws ClassNotFoundException {



        // demo1();

    }

    private static void demo1() throws ClassNotFoundException {
        // 获得对象的三种方法；
        Class<?> forName = Class.forName("com.how2java.reflect.Demo1");
        Class aClass = Demo1.class;
        Class<? extends Demo1> class1 = new Demo1().getClass();
        System.out.println(forName == aClass);
        System.out.println(forName == class1);
        /* 获取类对象的时候，会导致类属性被初始化 */
        /*
         * 无论什么途径获取类对象，都会导致静态属性被初始化，而且只会执行一次。（
         * 除了直接使用 Class c = Hero.class
         * 这种方式，这种方式不会导致静态属性被初始化）
         */
    }

}
