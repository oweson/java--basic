package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/13 0013 18:39
 */
public class DiguiTest {
    /**
     * public static final int demo1() {
     * System.out.println("hello");
     * demo1();
     * return 1;
     * }
     */
    public static void main(String[] args) {
        /*
         * 遍历文件夹以及其子目录
         * 递归 方法自己调用自己
         * 阶乘：一个正整数的阶乘（factorial）是所有小于及等于该数的正整数的积，
         * 并且0的阶乘为1。自然数n的阶乘写作n!
         */
        int jc = jc(5);
        System.out.println(jc);

    }

    private static int jc(int n) {
        if (n == 0) {
            return 1;
            //数学规定0的阶乘为1
        } else {
            return n * jc(n - 1);
            //自己调用自己的方法
        }
    }


}
