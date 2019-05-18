package basic.lambda;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月22日 下午9:11:38 类说明：侵权必究。。。。。。。
 */

public class Thread01 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("test thread lambda")).start();
        new Thread(() -> System.out.println("test lambda 02")).start();
    }

}
