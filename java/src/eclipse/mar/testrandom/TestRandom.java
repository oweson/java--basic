package eclipse.mar.testrandom;

import java.util.Random;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月15日 下午5:19:13 类说明：侵权必究。。。。。。。
 */

public class TestRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(100) + 10;
        /*生成随机的字符差是string 类型的*/

        System.out.println(a);
        String long1 = System.currentTimeMillis() + String.valueOf(a);
        System.out.println(long1);
    }

}
