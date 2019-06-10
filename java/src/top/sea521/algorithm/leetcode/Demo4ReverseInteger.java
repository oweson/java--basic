package top.sea521.algorithm.leetcode;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/10 20:33
 */
public class Demo4ReverseInteger {
    /**Input: 123
     Output: 321*/
    public static void reverseInteger(Integer num){
        String s = String.valueOf(num);
        StringBuffer sb = new StringBuffer();
        for (int length = s.length(); length > 0; length--) {
           sb.append(s.charAt(length-1));

        }
        int i = Integer.parseInt(new String(sb));
        System.out.println(i);
    }
    public static int reverse(int x) {
        long res = 0;
        // 321
        while (x != 0) {
            res = res * 10 + x % 10;
            // res=1; x=32 第二次：res=12; x=3;第三次：res=123;x=3;
            x = x / 10;

        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }
    public static void main(String[] args) {
        reverse(321);
        reverseInteger(123);
    }
}
