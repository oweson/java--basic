package eclipse.mar.basic;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/20 0020 9:59
 */
public class Demo3IfAndElse {
    /**
     * 闰年判断标准(满足任何一个)
     * 1. 如果能够被4整除，但是不能被100整除
     * 2. 能够被400整除
     */
    public static final void demo1() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入年份....");
            int year = scanner.nextInt();
            boolean b = year % 4 == 0 && year % 100 != 0;

            if (year % 400 == 0 || b) {
                System.out.println("是的");
            } else {
                System.out.println("不是");
            }
        }

    }

    public static final int demo2() {
        int a = 1;
        switch (a) {
            case 2:
                System.out.println("111");
                break;
            default:
                System.out.println("999999999");

        }
        return a;
    }

    public static void main(String[] args) {
        //demo1();
        //demo2();
        /** 1 do{
         } while 循环


         与while的区别是，无论是否成立，先执行一次，再进行判断*/
       /* int a = 100;
        do {
            System.out.println(a);
            a--;
        } while (a > 98);*/
        /** 2 结成 */
        /*int jj = 6;
        int sum = 1;
        for (int i = 1; i < jj; i++) {
            sum *= i;


        }
        System.out.println("6的结成是：" + sum);*/
        /** 3 天朝有一个乞丐姓洪，去天桥要钱
         第一天要了1块钱
         第二天要了2块钱
         第三天要了4块钱
         第四天要了8块钱
         以此类推

         问题： 洪乞丐干10天，收入是多少？*/
        /* int totalMoney=0;
         *//**每天的金额*//*
        int moneyEachDay = 0;
        for (int i = 1; i <=10 ; i++) {
            if(moneyEachDay==0){
                *//**第一天*//*
                moneyEachDay=1;
            }
            else {
                *//**除了第一天都是二倍翻倍*//*
                moneyEachDay*=2;
            }
            //2n-n-1
            totalMoney+=moneyEachDay;
            System.out.println("第"+i+"天：的money是"+totalMoney);
*/


        /** 3 continue

         继续下一次循环*/
       /* for (int i = 0; i < 10; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println(i);

        }*/
        /** 4 break:结束循环*/
        //打印单数
       /* for (int j = 1; j < 10; j++) {
            if (0 == j % 2)
                break; //如果是双数，直接结束for循环

            System.out.println(j);
        }
    }*/
        /** 5 使用标签结束外部循环 顶 折 纠 问
         在外部循环的前一行，加上标签
         在break的时候使用该标签
         即能达到结束外部循环的效果*/
      /* ppx://定义的结束标签
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(j/2==4){
                    break ppx;
                }
                System.out.println(j);


            }
*/
        /** 6 水仙花：水仙花数定义：
         1. 一定是3位数
         2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3

         寻找所有的水仙花数*/
       /* int i1 = 998 / 100;
        int i2 = 998 / 10 % 10;
        int i3 = 998 % 10;
        System.out.println(i1+i2+i3+"----------------------------");
        for (int i = 100; i <=999 ; i++) {
            int bai = i / 100;
            int shi = i / 10 % 10;
            int gewei = i % 10;
            if(i==(bai*bai*bai+shi*shi*shi+gewei*gewei*gewei)){
                System.out.println(i);
            }


        }*/

    }
}

