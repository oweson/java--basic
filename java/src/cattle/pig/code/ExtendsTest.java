package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 11:45
 */
public class ExtendsTest {
    /**
     * 解析：初始化过程：
     * 1. 初始化父类中的静态成员变量和静态代码块 ；
     * 2. 初始化子类中的静态成员变量和静态代码块 ；
     * 3.初始化父类的普通成员变量和代码块，再执行父类的构造方法；
     * 4.初始化子类的普通成员变量和代码块，再执行子类的构造方法；
     * <p>
     * （1）初始化父类的普通成员变量和代码块，执行  Y y=new Y();  输出Y
     * （2）再执行父类的构造方法；输出X
     * （3） 初始化子类的普通成员变量和代码块，执行  Y y=new   Y();  输出Y
     * （4）再执行子类的构造方法；输出Z
     * 所以输出YXYZ
     */
    public static void main(String[] args) {
        new Z();
    }

}

class X {
    //第二
    Y y = new Y();

    public X() {
        System.out.print("X");
    }
}

class Y {
    public Y() {
        System.out.print("Y");
    }
}

class Z extends X {
    //第一
    Y y = new Y();

    public Z() {
        System.out.print("Z");
    }


}
