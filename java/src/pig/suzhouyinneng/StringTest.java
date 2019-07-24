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
        // 1 比较的是地址 false,调用了new生成了对象！！！
        Integer c = new Integer(100);
        Integer d = new Integer(100);
        // 2 缓存池
        Integer x = 100;
        Integer y = 100;

        System.out.println(c == d);
        // 3 false
        System.out.println(x == y);
        // 4 true
    }
}
