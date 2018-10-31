package eclipse.mar.enums;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月23日 下午9:14:53 类说明：侵权必究。。。。。。。
 */

public class TestEnum3 {
    public static void main(String[] args) {
        for (Demo3EnumCar c : Demo3EnumCar.values()) {
            System.out.println(c.getPrice());
        }
    }

}
