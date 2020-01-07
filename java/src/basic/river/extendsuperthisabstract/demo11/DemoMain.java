package basic.river.extendsuperthisabstract.demo11;

public class DemoMain {

    public static void main(String[] args) {
        /*什么是编译看左边？
         * 在多态中，向上转型和向下转型有很多的应用。
         * 例如： 1：  Animal c = new Cat();   //类型提升，向上转型
         *             在编译时：参阅引用型变量所属类中是否有调用的方法。如果有。编译通过，没有编译失败
         *                     在运行时：参阅对象所属类中是否有调用方法。
         *             简单一句话：成员函数在多态时，编译看左边，运行看右边。
         *        2：  如果想要调用猫的特有方法,如何操作？
         *             强制将父类的引用，转成子类类型。向下转型
         *             Cat c = (Cat)a;
         *                    c.catchMouse();
         *            3:     在多态中，调用子类函数，子类方法必须覆盖父类中的方法，如果调用子类特有的方法，就必须向下转型了。
         *             这样非静态的方法可直接调用。
         *             在多态中，成员变量的特点：
         *             无论编译和运行，都参考左边（引用型变量所属的类，）
         *             在多态中，静态成员函数的特点：
         *             无论编译和运行，都参考做左边*/
// Animal animal = new Animal();
// 错误写法！不能直接创建抽象类对象

        Cat cat = new Cat();
        cat.eat();
        Animal animal = new Cat();
        animal.normalMethod();
    }

}
