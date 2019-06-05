package basic.pond.innerclass.innerclass;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/15 0015 12:31
 */
public class AnimalInnerClassTest {
    private int age;
    private String name;
    private static int height = 21;
    Bird bird;

    public AnimalInnerClassTest() {
        bird = new Bird();
    }

    public static final void demo1() {
        System.out.println("static fun from parent!");
    }

    public void demo2() {
        // 引用内部类的变量，需通过实例
        int age = bird.age;
        System.out.println("simple fun from parent!");
    }

    /**
     * 1 成员内部类；
     * 成员内部类中不能存在static关键字，
     * 即，不能声明静态属性、静态方法、静态代码块等。
     * 【非静态内部类也可以定义静态成员但需要同时有final关键词修饰，
     * 静态方法鉴于无法用final修饰，仍必须是在静态内部类 或者非内部类中定义。】
     */
    //------------------------------------------------

    /**
     * 1 成员内部类......相当于非静态方法；
     * 成员内部类是最普通的内部类，它的定义为位于另一个类的内部
     **/
    class Bird {

        private int age;

        public void demo1() {
            int age = 1;
            //局部
            System.out.println("public" + age);
        }

        //内部类成员
        private void demo2() {
            /**外部类.this.成员变量
             外部类.this.成员方法*/

            // 直接访问外部类的普通方法

            AnimalInnerClassTest.this.demo2();
            // 同上
            System.out.println("demo2" + this.age);
            //外部类的成员
            System.out.println(AnimalInnerClassTest.this.age);
        }

    }

    /**
     * 2 静态内部类；
     * 那么内部类就只能访问外部类的静态成员变量，具有局限性
     */
    static class Dog {
        /**
         * 可以这样理解：与外部类同级的类，或者叫做外部类的静态成员
         */
        public void staticFun() {
            // 访问外部类的静态成员
            System.out.println(height);

        }
        public static final void demo1(){
            System.out.println("我是静态内部类的函数！");
        }

        public static void main(String[] args) {
            // 访问外部类的静态方法
            demo1();
            AnimalInnerClassTest.demo1();

        }

    }

    public static void main(String[] args) {
        /** 第一种方式：
         Outter outter = new Outter();
         Outter.Inner inner = outter.new Inner();
         //必须通过Outter对象来创建

         //第二种方式：
         Outter.Inner inner1 = outter.getInnerInstance();*/
        /** 1 访问成员内部类
         * 必须先有外部类的对象才能生成内部类的对象，
         * 因为内部类的作用就是为了访问外部类中的成员变量*/
        AnimalInnerClassTest.Bird bird = new AnimalInnerClassTest().new Bird();
        bird.demo1();
        bird.demo2();
        System.out.println("==================");
        // 2 访问静态内部类的静态函数
        AnimalInnerClassTest.Dog.demo1();
        Dog dog = new Dog();
        AnimalInnerClassTest.Dog dog1 = new AnimalInnerClassTest.Dog();
        System.out.println(dog.equals(dog1));
        System.out.println("--------------------------------");
       dog1.staticFun();


    }
}
