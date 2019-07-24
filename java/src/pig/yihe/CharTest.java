package pig.yihe;

import java.util.Arrays;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/21 0021 21:09
 */
public class CharTest {
    public static void main(String[] args) {
        char[] ch1 = new char[2];
        ch1[0] = 'a';
        ch1[1] = 'b';
        char[] ch2 = new char[2];
        ch2[0] = 'a';
        ch2[1] = 'b';
        System.out.println(ch1.equals(ch2));
        // 1 false
        System.out.println(Arrays.equals(ch1, ch2));
        // 2 rue
        /**数组的比较！！！是这样的！*/
        String s = new String("abc");
        String ss = new String("abc");
        System.out.println(s.equals(ss));
        //true


    }
}
