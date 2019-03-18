package pig.shangyangkeji;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/14 0014 6:59
 */
public class Demo2 extends Object {
    public static void main(String[] args) {
        System.out.println(0 % 10);
        System.out.println(0 / 2);
        System.out.println(1 / 3);
        System.out.println(1 % 6);
        System.out.println("----------------------");
        System.out.println(2 + 2 + "5" + 2 + 2);
        // 1 clone 是的，
        String m = "a" + "b";
        String n = "ab";
        Integer a = 1;
        int c = 1;
        Integer b = new Integer("1");
        System.out.println(m == n);
        System.out.println(a == b);
        System.out.println(a == c);
        // true false true;
    }
}
