package pig.offier;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/7/4 15:56
 */
public class Demo1StringImmutable {
    public static void main(String[] args) {
        // 字符串是不变的！！！
        String s = "abcd";
        s = s.concat("ef");
    }
}
