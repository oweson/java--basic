package basic.basic.other;

import java.util.Random;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月15日 下午5:19:13 类说明：侵权必究。。。。。。。
 */

public class GeneratorOrder {
    public static void main(String[] args) {
        Random random = new Random();
        /** 1 一般用于生成订单*/
        int a = random.nextInt(100) + 10;
        /* 2 生成随机的字符串是string 类型的*/

        System.out.println(a);
        long long1 = System.currentTimeMillis() + a;
        System.out.println(long1);
    }

}
