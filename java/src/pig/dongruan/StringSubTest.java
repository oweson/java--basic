package pig.dongruan;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/16 0016 19:50
 */
public class StringSubTest {
    public static void main(String[] args) {
        String s = "hello,world";
        System.out.println(s.substring(2));
        // 1 截串，前闭后开
        System.out.println(s.substring(0, 2));
        // 2 前闭后开
        //llo,world
        //he
    }
}
