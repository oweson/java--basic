package com.innerclass;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/21 0021 22:30
 */
class Circle {
    private double radius = 0;
    public static int count = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void testOuterMethed() {
        System.out.println("我是外部类的方法");
    }

    /**
     * 这样看起来，类Draw像是类Circle的一个成员，Circle称为外部类。成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）。
     */
    /**
     * 不过要注意的是，当成员内部类拥有和外部类同名的成员变量或者方法时，会发生隐藏现象，即默认情况下访问的是成员内部类的成员。如果要访问外部类的同名成员，需要以下面的形式进行访问：
     * <p>
     * 1
     * 2
     * 外部类.this.成员变量
     * 外部类.this.成员方法
     */
    class Draw {     //内部类
        public void drawSahpe() {
            System.out.println(radius);  //外部类的private成员
            System.out.println(count);   //外部类的静态成员
        }
    }

    class Ppx {
        /**
         * 内部类不能有static成员变量
         */
        private double radius = 100000;
        public int count = 1;
        public int count1 = 1;

    }


    public Ppx ppg() {
        class Bird extends Ppx {
            /**局部内部类相当于一个局部的变量
             * 局部内部类就像是方法里面的一个局部变量一样，是不能有public、protected、private以及static修饰符的。*/
        }
        System.out.println(this.radius);
        System.out.println(count);
        return new Bird();
    }

    static class Fish {
        int count = 21000;

        /**
         * 京塔内部类
         */
        public void haHa() {
            /**默认访问静态内部类的
             * 外部类.陈冠变量，访问外部类的*/
            System.out.println(count + "static");
            System.out.println(Circle.count + "circle");
            System.out.println(new Circle().radius);
        }

        public Fish() {
            System.out.println(count);
            System.out.println();
        }

        public void say() {
            System.out.println();
            /**4.静态内部类

             　　静态内部类也是定义在另一个类里面的类，
             只不过在类的前面多了一个关键字static。\
             静态内部类是不需要依赖于外部类的，这点和类的静态成员属性有点类似，
             并且它不能使用外部类的非static成员变量或者方法，
             这点很好理解，因为在没有外部类的对象的情况下，
             可以创建静态内部类的对象，如果允许访问外部类的非static成员就会产生矛盾，
             因为外部类的非static成员必须依附于具体的对象*/
            System.out.println(count + "我是静态的哈哈哈哈");
        }
    }

    public static void main(String[] args) {
        /**静态的内部类不依赖于外部类，只能访问外部类的静态成员和方法；*/
        new Fish().say();

        Fish f = new Fish();
        f.say();
        f.haHa();
        System.out.println(Fish.class.getClassLoader());

        Circle circle = new Circle();
        Ppx ppg = circle.ppg();
        System.out.println(ppg);
        Circle c = new Circle();
        Circle.Draw d = c.new Draw();
/**创建内部类的对象*/
        d.drawSahpe();
        /**成员内部类是依附外部类而存在的，也就是说，如果要创建成员内部类的对象，前提是必须存在一个外部类的对象。创建成员内部类对象的一般方式如下：*/
    }
}
