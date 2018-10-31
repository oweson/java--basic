package classic.onehundred;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/19 0019 19:13
 */
public class ShuiXianHua {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("input............");
            int i = scanner.nextInt();
            int i1 = i / 100;
            //的得到十位
            int i2 = i % 100 / 10;
            //得到各位
            int i3 = i % 10;
            if (i1 * i1 * i1 + i2 * i2 * i2 + i3 * i3 * i3 == i) {
                System.out.println("yes");

            } else {
                System.out.println("no");
            }

        }


    }
}
