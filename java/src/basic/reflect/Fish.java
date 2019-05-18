package basic.reflect;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/29 0029 21:32
 */
public class Fish {
    /**
     * 反射:在运行状态下,通过class文件对象,去使用构造方法,成员变量,成员方法
     * 　　方法有三种:
     * 　　1.类名.class
     * 　　2.对象.getclass()
     * 　　3.class.forName("包名.类名")
     * 　　好处:
     * 　　只要有一个类或者一个类的对象,就可以得到这个类或对象的所有属性和方法,包括私有的
     * 　　同步方法
     * <p>
     * 　　反射成员方法：
     * 　　1.获取字节码文件
     * 　　Class c = Class.forName("包名.类名")；
     * 　　2.反射方法
     * 　　Method m = c.getMethod("反射的方法"，方法的参数类型.class);
     * 　　3.用方法,m.invoke(对象，参数)   对象，c.newInstance ,在A建立对象。
     * 　　m.invoke(c.newInstance(),参数)；
     */
    public static int age = 21;

    public void demo1() {
        System.out.println("fish!");
    }

    public static void demo3() {
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        try {
            // 1
            Class clazz = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
        }
        // 2
        Class clazz2 = String.class;
        String str = new String("Hello");
        // 3
        Class clazz3 = str.getClass();
        // Object o = clazz2.newInstance();
        Class<Fish> fishClass = Fish.class;
        Fish fish = fishClass.newInstance();
        fish.demo1();
        // static优先于对象的存在，不能对象点调用，可以类名点调用
        Fish.demo3();


    }

    public void demo2() {
        Fish fish1 = new Fish();
        fish1.demo1();
        fish1.demo2();

    }


}
