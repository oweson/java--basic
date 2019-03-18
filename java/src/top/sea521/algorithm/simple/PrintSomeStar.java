package top.sea521.algorithm.simple;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/4 0004 16:23
 */
public class PrintSomeStar {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
