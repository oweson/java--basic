package pig.huyu;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/4 0004 19:35
 */
public class Demo3StringTest {
    public static String s;

    public static void main(String[] args) {
        System.out.println(s + "one");
        printString();

    }

    private static void printString() {
        /**局部变量必须初始化才能使用！！！*/
        String s = null;
        System.out.println(s + "Two");
        // nullone
        //nullTwo
    }
}
