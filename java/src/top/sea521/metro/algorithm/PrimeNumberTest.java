package top.sea521.metro.algorithm;

import org.junit.Test;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/30 0030 16:05
 */
public class PrimeNumberTest {
    @Test
    public  void demo1(){
        System.out.println(Math.sqrt(100));
    }
    public static void main(String[] args) {
        /**题目：判断101-200之间有多少个素数，并输出所有素数。
         程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数的平方根！！！)，
         如果能被整除， 则表明此数不是素数，反之是素数。   */
        int count = 0;
        for (int i = 101; i < 200; i += 2) {
            boolean b = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    /**不是素数，中断......*/
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            if (b == true) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("素数个数是: " + count);
    }
}

