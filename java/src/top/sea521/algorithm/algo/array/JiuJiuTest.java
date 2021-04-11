package top.sea521.algorithm.algo.array;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/11 0011 16:31
 */
public class JiuJiuTest {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        demo1();
    }

    private static void demo1() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "="+i * j + " ");

            }
            System.out.println();

        }
    }
}
