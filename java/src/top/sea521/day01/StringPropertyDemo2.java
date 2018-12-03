package top.sea521.day01;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/4 0004 15:33
 */
public class StringPropertyDemo2 {
    public static int a = 100;

    public static void demo() {
        a = 100;
        /**方法中不能定义private成员变量*/
    }

    public static void main(String[] args) {
        short aa = 1;
        aa += 1;

        int i = aa << 3;
        System.out.println(i);
        /**
         *
         * +=没事
         * +就有问题，需要手动的强制转换*/
        String a = "";
        System.out.println(a.length());
        String ppx = "asa";
        System.out.println(ppx.length());
        System.gc();
        System.out.println(ppx + "jashajshajshajshajshajshajshaj");
    }
}
