package top.sea521.algorithm;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/30 0030 15:56
 */
public class TransferToNumber {
    public static void main(String[] args) {
        String str = "13abf";
        int len = str.length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            /**减1是因为下标0开始的！！！*/
            char c = str.charAt(len - 1 - i);
            int n = Character.digit(c, 16);
            sum += n * (1 << (4 * i));
        }
        System.out.println(sum);
    }
}
