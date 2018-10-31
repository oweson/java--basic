package eclipse.mar.enums;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月23日 下午9:04:35
 * 类说明：侵权必究。。。。。。。
 */

public class TestEnum01 {
    public static void main(String[] args) {
        Demo1Enum demo1Enum;
        demo1Enum = Demo1Enum.honda;
        switch (demo1Enum) {
            case honda:
                System.out.println("hello,world");

                break;

            default:
                System.out.println("aaaaaaaaaaassss");
                break;
        }
    }

}
