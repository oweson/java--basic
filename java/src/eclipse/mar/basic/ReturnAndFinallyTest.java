package eclipse.mar.basic;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/27 0027 9:39
 */
public class ReturnAndFinallyTest {
    public static int demo1() {
        int a = 100;
        try {
            System.out.println("try");


            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
            a += 100;
            System.out.println(a+"     finally");
        }
        System.out.println("after finally;");
        return a;
    }


    public static void main(String[] args) {
        int i = ReturnAndFinallyTest.demo1();
        System.out.println(i);


    }
}
