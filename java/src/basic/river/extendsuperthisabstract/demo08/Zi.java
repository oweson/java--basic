package basic.river.extendsuperthisabstract.demo08;

/**
 * super关键字的用法有三种：
 * 1. 在子类的成员方法中，访问父类的成员变量。
 * 2. 在子类的成员方法中，访问父类的成员方法。
 * 3. 在子类的构造方法中，访问父类的构造方法。
 */
public class Zi extends Fu {

    int num = 20;
    public Zi() {
        // 不写也是默认调用！
        super();
    }

    public void methodZi() {
        System.out.println(super.num);
        // 父类中的num
    }

    @Override
    public void method() {
        super.method();
        // 访问父类中的method
        System.out.println("子类方法");
    }

    public static void main(String[] args) {
        new Zi().method();
    }

}
