package basic.river.extendsuperthisabstract.demo09;

/**
 * super关键字用来访问父类内容，而this关键字用来访问本类内容。用法也有三种：
 * 1. 在本类的成员方法中，访问本类的成员变量。
 * 2. 在本类的成员方法中，访问本类的另一个成员方法。
 * 3. 在本类的构造方法中，访问本类的另一个构造方法。
 * 在第三种用法当中要注意：
 * A. this(...)调用也必须是构造方法的第一个语句，唯一一个。
 * B. super和this两种构造调用，不能同时使用。
 */
public class Zi extends Fu {

    private int num = 20;
    public Zi() {
        // super();这一行不再赠送
        this(123);
        // 本类的无参构造，调用本类的有参构造
        //this(1, 2);错误写法！因为必须第一行出现，已经出现了，
    }

    public Zi(int n) {
        this(1, 2);
    }

    public Zi(int n, int m) {
        System.out.println(n+"  "+m);
    }

    public void showNum() {
        int num = 10;
        System.out.println(num);
        // 1 局部变量
        System.out.println(this.num);
        // 2 本类中的成员变量
        System.out.println(super.num);
        // 3 父类中的成员变量
    }

    public void methodA() {
        System.out.println("AAA");
    }

    public void methodB() {
        //todo?成员变量为何可以直接在普通的方法里面使用？
        methodA();
        this.methodA();
        System.out.println("BBB");
        int num = this.num;
        System.out.println(num);
    }

    public static void main(String[] args) {
        new Zi();
    }

}
