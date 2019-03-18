package top.sea521.algorithm;

import org.junit.Test;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/30 0030 16:29
 */
public class ScoreTest {
    @Test
    public void demo1(){
        int a=100;
        int dd=a>21?0:-1;
        System.out.println(dd);
    }
    public static void main(String[] args) {
        /**题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，
         * 60-89分之间的用B表示，60分以下的用C表示。*/
        System.out.println("请输入分数");
        System.out.println("输入y是继续，输入退出");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String nextLine = sc.nextLine();

                if (nextLine.equalsIgnoreCase("N")) {
                    break;

                } else {
                    /**正常的运行;
                     * 三目：  grade = (x >= 90 ? 'A')
                     *            : (x >= 60 ? 'B')
                     *            :('C');*/
                    int parseInt = Integer.parseInt(nextLine);
                    if (parseInt >= 90) {
                        System.out.println("B");
                    } else if (parseInt <= 90 && parseInt >= 80) {
                        System.out.println("C");
                    } else {
                        System.out.println("null");
                    }
                }

            }

        }
    }

