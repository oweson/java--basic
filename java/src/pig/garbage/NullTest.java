package pig.garbage;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/5 0005 17:44
 */
public class NullTest {
    public static final void demo1(Object object) {
        System.out.println(object + "object");
    }

    public static final void demo1(String string) {
        System.out.println(string + "string");
    }

    public static void main(String[] args) {
        demo1(null);
        //nullstring 小的-object;
    }
}
