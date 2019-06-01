package top.sea521.algorithm.simple;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/12 0012 18:01
 */
public class TestSwitch {
    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < 12; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                    a = 31;
                    break;
                case 2:
                case 4:
                case 6:
                    a = 30;
                    break;
            }
            sum += a;

        }
        System.out.println("总共具有一些的天数是" + sum);

    }
}
