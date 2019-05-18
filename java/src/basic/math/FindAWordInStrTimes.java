package basic.math;


import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/26 0026 15:30
 */
public class FindAWordInStrTimes {
    /**
     * 1 分析以下需求，并用代码实现
     * 1.键盘录入一个大字符串,再录入一个小字符串
     * 2.统计小字符串在大字符串中出现的次数
     * 3.代码运行打印格式:
     * 请输入大字符串:woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
     * 请输入小字符串:heima
     * 控制台输出:小字符串heima,在大字符串woaiheima,heimabutongyubaima,
     * wulunheimahaishibaima,zhaodaogongzuojiushihaoma中共出现3次
     */
    public static void main(String[] args) {
        /** 查找小串在大串的出现次数；*/
        Scanner sc = new Scanner(System.in);
        System.out.println("输入小串");
        String small = sc.nextLine();
        System.out.println("请输入大串");
        String big = sc.nextLine();
        int count = countStr(small, big);
        System.out.println("小串" + small + "在" + big + "出现了" + count);
    }

    private static int countStr(String small, String big) {
        int index = 0;
        int count = 0;
        while ((index = big.indexOf(small, index)) != -1) {
            index++;
            count++;
        }
        return count;
    }
}
