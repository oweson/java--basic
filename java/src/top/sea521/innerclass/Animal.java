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

    class Bird {
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
        public void staticFun() {
            System.out.println(height);

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
