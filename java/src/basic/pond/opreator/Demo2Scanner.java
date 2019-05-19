package basic.pond.opreator;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月25日 下午8:56:17 类说明：侵权必究。。。。。。。
 */

public class Demo2Scanner {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("input float..................");
        float nextFloat = scanner.nextFloat();
        System.out.println("input other.....................");
        BigDecimal nextBigDecimal = scanner.nextBigDecimal();
        System.out.println(nextFloat);
        System.out.println(nextBigDecimal);
    }

}
