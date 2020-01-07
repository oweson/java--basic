package basic.river.extendsuperthisabstract;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/10 0010 7:40
 */
public class Son extends Parent {
    static {
        System.out.println("son static");
    }

    {
        System.out.println("son ....");
    }

    public Son() {
        System.out.println("son constr");
    }

    public static void main(String[] args) {
        /*第一不创建对象：父类静态快----子类静态块*/
        System.out.println("start");
        /*第二：创建对象：父类构造快--父类构造函数--子类构造快--子类构造函数*/
        new Son();
    }
}
