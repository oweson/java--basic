package pig.huyu;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/4 0004 19:42
 */
public class Demo4ExtendTest {
    public static int a = 100;
}

class ExtendsTest extends Demo4ExtendTest {
    /**频闭！！！*/
    public int a = 10000;

    public static void main(String[] args) {
        System.out.println(new ExtendsTest().a);
        System.out.println();
    }
}
