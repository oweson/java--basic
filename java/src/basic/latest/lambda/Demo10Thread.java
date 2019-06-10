package basic.latest.lambda;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月22日 下午9:11:38 类说明：侵权必究。。。。。。。
 */

public class Demo10Thread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new Thread(() -> System.out.println("test thread lambda" + Thread.currentThread().getName())).start();
        new Thread(() -> System.out.println("test lambda 02" + Thread.currentThread().getName())).start();
    }

}
