package top.sea521.day01;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/27 0027 9:39
 */
public class TestReturnAndFinally {
    public static int demo1() {
        int a = 100;
        try {
            System.out.println("sasasasas");
            System.out.println("sasasasas");


            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("我来了");
            a += 100;
            System.out.println("怒会");
        }
        System.out.println("sasasasas");
        return a;
    }


    public static void main(String[] args) {
        int i = TestReturnAndFinally.demo1();
        System.out.println(i);


    }
}
