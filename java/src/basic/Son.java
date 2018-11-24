package basic;

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
    public Son(){
        System.out.println("son constr");
    }

    public static void main(String[] args) {
        System.out.println("start");
    }
}
