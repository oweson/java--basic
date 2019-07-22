package pig.easyfalse;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/15 0015 9:32
 */
public class Demo2CanChangeParamTest {
    public static void main(String[] args) {
        demo1Test(1, 2, 3);
       // demo1Test(null); java.lang.NullPointerException
    }

    private static void demo1Test(Integer... integers) {
        for (int i = 0; i < integers.length; i++) {
            System.out.println(integers[i]);

        }
    }
}
