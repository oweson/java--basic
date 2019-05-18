package basic.extendsuperthisabstract.demo12;

public class DemoMain {

    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.eat();
        // 子类调用父类的有参构造器；完成成员变量的二次初始化；
        System.out.println(zi.a);


    }

}
