package top.sea521.innerclass;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/15 0015 12:31
 */
public class Animal {
    private int age;
    private String name;
    private static int height = 21;
    Bird bird;
    public Animal(){
        bird=new Bird();
    }
    public static final void demo1(){
        System.out.println("static fun from parent!");
    }
    public void demo2(){
        // 引用内部类的变量，需通过实例
        int age = bird.age;
        System.out.println("simple fun from parent!");
    }
    /** 1 成员内部类；
     * 成员内部类中不能存在static关键字，即，不能声明静态属性、静态方法、静态代码块等。
     * 【非静态内部类也可以定义静态成员但需要同时有final关键词修饰，
     * 静态方法鉴于无法用final修饰，仍必须是在静态内部类 或者非内部类中定义。】*/
    class Bird {
        // 成员内部类......相当于非静态方法
        private int age;

        public void demo1() {
            int age = 1;
            //局部
            System.out.println("public" + age);
        }

        //内部类成员
        private void demo2() {
            System.out.println("demo2" + this.age);
            //外部类的成员
            System.out.println(Animal.this.age);
        }

    }

    /**
     * 2 静态内部类；
     * 那么内部类就只能访问外部类的静态成员变量，具有局限性
     */
    static class Dog {
        // 可以这样理解：与外部类同级的类，或者叫做外部类的静态成员
        public void staticFun() {
            System.out.println(height);

        }

        public static void main(String[] args) {
            demo1();
            Animal.demo1();

        }

    }

    public static void main(String[] args) {
        /** 1 必须先有外部类的对象才能生成内部类的对象，
         * 因为内部类的作用就是为了访问外部类中的成员变量*/
        Animal.Bird bird = new Animal().new Bird();
        bird.demo1();
        bird.demo2();
        System.out.println("==================");



    }
}
