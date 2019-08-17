package top.sea521.utils;

import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/17 21:07
 */
public class DateTest {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        //1566047316108
        Date date = new Date(l+96000);
        System.out.println(date);
    }
}
