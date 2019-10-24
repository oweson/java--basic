package top.sea521.algorithm.leetcode;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/10/24 22:59
 */
public class Demo6 {
    public static boolean isPowerOfFour(int num) {
        while ( (num != 0)  && (num % 4 == 0)) {
            num /= 4;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        boolean powerOfFour = isPowerOfFour(64);
        System.out.println(powerOfFour);
    }
}
