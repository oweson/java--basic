package pig.suzhouyinneng;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/28 0028 16:35
 */
public class StringTest {
    public static void main(String[] args) {
        String a = new String("abc");
        String b = new String("abc");
        System.out.println(a == b);
        //比较的是地址 false
        Integer c = new Integer(100);
        Integer d = new Integer(100);
        // 缓存池
        Integer x = 100;
        Integer y = 100;

        System.out.println(c == d);
        // false
        System.out.println(x == y);
        // true
    }
}
