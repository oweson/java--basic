package eclipse.mar.extendsuperthisabstract.demo02;

public class Fu {

    int numFu = 10;

    int num = 100;

    public void methodFu() {
        // 使用的是本类当中的，不会向下找子类的
        // 普通的成员变量可以直接使用
        System.out.println(num);
        System.out.println(numFu);
    }

    public static void printTest() {
        // static方法直接加载，与类同存！优先于对象的创建！
        System.out.println(new Fu().num);
    }

}
