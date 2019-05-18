package basic.math;

import java.util.Random;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月26日 下午7:27:52 类说明：侵权必究。。。。。。。
 */

public class ToGeneratorNumber {

    public static void main(String[] args) {
        demo1();
        demo2();

    }

    private static void demo2() {
        System.out.println(Math.random() * 10);
        System.out.println(Math.random() * 10);
        /**可以生成布尔，数字，
        就是需要对象才能调用；消耗内存；**/
        System.out.println(new java.util.Random().nextBoolean());
        /**生成浮点型数字；*/
        System.out.println(new Random().nextDouble()*1000);

    }

    private static void demo1() {
        /**生成随机的整数*/
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(101);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Math.round(Math.random() * 10));

        }
    }

}
