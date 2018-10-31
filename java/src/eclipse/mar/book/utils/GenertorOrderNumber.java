package eclipse.mar.book.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月20日 上午8:01:54 类说明：侵权必究。。。。。。。
 */

public class GenertorOrderNumber {
    public static void main(String[] args) {
        Random random = new Random();
        String orderCode = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) + random.nextInt(10000);
        System.out.println(orderCode);
        System.out.println(random.nextInt(10000));
    }

}
