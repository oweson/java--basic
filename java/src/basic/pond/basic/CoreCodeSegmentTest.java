package basic.pond.basic;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/6 0006 6:51
 */
public class CoreCodeSegmentTest {
    public static void whichNumberIsOddOrEven() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("input please................");

            int nextInt = sc.nextInt();
            if (nextInt % 2 != 0) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
        }
    }

    public static void main(String[] args) {
        whichNumberIsOddOrEven();

    }
}
