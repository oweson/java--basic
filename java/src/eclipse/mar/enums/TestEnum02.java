package eclipse.mar.enums;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月23日 下午9:08:57 类说明：侵权必究。。。。。。。
 */

public class TestEnum02 {
    public static void main(String[] args) {
        Demo2FourSeasonEnum spring = Demo2FourSeasonEnum.SPRING;
        switch (spring) {
            case SPRING:
                System.out.println("sspring is comming ");

                break;

            default:
                System.out.println("what so what...f");
                break;
        }
    }

}
