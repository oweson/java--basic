package pig.easyfalse;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/4 0004 9:27
 */
public class Demo3ExceptionAndFinallyTest {
    public static final int demo1() {
        try {
            int a = 9999;
            System.out.println(a);
            // 1 暂存起来，准备返回！
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 2 直接返回！
            return 10000000;
        }
    }

    public static void main(String[] args) {
        System.out.println();
        int i = demo1();
        System.out.println(i);
        /**catch里面有return;即使是空，finally运行完毕，没有return，
         * 就会直接走catch里面的语句；
         * finally return 语句快外面的语句就不会运行了!!!
         * system.exit(0);finally不会运行！！！*/

    }
}
