package top.sea521.algorithm;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/30 0030 16:16
 */
public class NarcissusTest {
    public static void main(String[] args) {
        isWaterFlower();
        /**题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，
         * 其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，
         * 因为153=1的三次方＋5的三次方＋3的三次方。*/
        while (true) {
            System.out.println("请输入一个数字......");
            Scanner sc = new Scanner(System.in);
            int nextInt = sc.nextInt();
            /**提取个位和百位和千位的数字;
             * m=898
             *   b3 = m / 100;
             *       b2 = m % 100 / 10;//得到9
             *       b1 = m %    10;//得到1*/
            int c = 891;
            int bai = nextInt / 100;
            int shi = nextInt % 100 / 10;
            int ge = nextInt % 10;
            if ((bai * bai*bai + shi * shi*shi + ge * ge*ge) == nextInt) {
                System.out.println(nextInt + "是水仙花数字！！！");
                break;
            }

        }
    }

    private static void isWaterFlower() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入数据！");
        while (true){
            int tem=879;
            int nextInt = sc.nextInt();
            int bai = nextInt /100;
            int shi = nextInt % 100 / 10;
            int ge = nextInt % 10;
            //if(){}
        }
    }
}
