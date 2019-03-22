package pig.guangzhou.kuaipi;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/12 0012 23:05
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer a = 100, b = 100, c = 150, d = 150;
        System.out.println(a == b);
        // true
        System.out.println(c == d);
        // false
        System.out.println("11111111111111111111");
        String s1 = "hello";
        String s2 = new String("hello");
        String s3 = "hel" + "lo";
        // 不可变，生成新的对象
        System.out.println(s1 == s2);
        // false
        System.out.println(s2 == s3);
        // false
        System.out.println(s1.equals(s3));
        // true
        System.out.println(s1.intern() == s2.intern());
        //true

    }
}
