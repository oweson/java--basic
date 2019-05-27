package top.sea521.design.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/23 0023 11:15
 */
public enum Demo1EnumMain {
    /**
     *  继承java.lang.enum不是object,
     *  第二：枚举类默认被final修饰；
     *  第三：private构造器；
     *  他的实质就是包含固定的数量是咧，而且是咧的值也是固定的，假如有public的构造器，外面就可以创建很多，就没有用了；
     *  */
    /**
     * 修饰符默认public static final;
     * 天生安全，面对反序列化，反射攻击；
     */

    INSTANCE;

    /**
     * 枚举里的属性相当于Singleton的实例
     */


    private Student student;

    /**
     * 枚举类声明了抽象方法必须实现或者声明为抽象类
     */

    /**
     * 可以private,default,protected，public修饰符
     */

    Demo1EnumMain() {
        student = new Student();
        System.out.println("我是枚举类的构造函数，是私有的！");

    }

    public Student getStudent() {
        return student;
    }

    /**
     * 返回对象；
     */
    public static Demo1EnumMain getInstance() {
        return INSTANCE;
    }


}
