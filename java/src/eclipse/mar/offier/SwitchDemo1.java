package eclipse.mar.offier;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/18 0018 21:08
 */
public class SwitchDemo1 {
    public static void main(String[] args) {
        System.out.println("请输入分数");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = Integer.parseInt(s);
        switch (i) {
            case 100:
                System.out.println("牛逼");
                break;
            default:
                System.out.println("ppx");
                /**切记需要break*/
                break;
        }
    }
}
