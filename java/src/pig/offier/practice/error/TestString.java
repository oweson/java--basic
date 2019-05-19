package pig.offier.practice.error;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/17 0017 11:00
 */
public class TestString {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        System.out.println(a == b);
        System.out.println("------------------------");
        String c = "hello";
        /**在产量池查找，找不到在创建*/
        String d = c.intern();
        System.out.println(c == d);

    }
}
