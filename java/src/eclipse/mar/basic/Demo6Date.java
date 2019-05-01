package eclipse.mar.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/21 0021 21:29
 */
public class Demo6Date {
    public static void main(String[] args) throws ParseException {
        /** 1 getTime() 得到一个long型的整数
         这个整数代表 从1970.1.1 08:00:00:000 开始 每经历一毫秒，增加1*/

        System.out.println(new Date());
        System.out.println(new Date().getTime());
        Date zero = new Date(0);
        System.out.println("用0作为构造方法，得到的日期是:"+zero);
        /** 2 System.currentTimeMillis() 顶 折 纠 问
         当前日期的毫秒数
         new Date().getTime() 和 System.currentTimeMillis() 是一样的
         不过由于机器性能的原因，可能会相差几十毫秒，毕竟每执行一行代码，都是需要时间的*/
        long l = System.currentTimeMillis();
        System.out.println(l);
        /** 3 SimpleDateFormat 日期格式化类;
         * 日期转字符串 顶 折 纠 问
         *
         * y 代表年
         * M 代表月
         * d 代表日
         * H 代表24进制的小时
         * h 代表12进制的小时
         * m 代表分钟
         * s 代表秒
         * S 代表毫秒*/
       /* SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        String format = sdf.format(new Date());
        System.out.println(format);*/
        /** 4 字符串转日期
         模式（yyyy/MM/dd HH:mm:ss）需要和字符串格式保持一致，
         如果不一样就会抛出解析异常ParseException*/
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );

        String str = "2016/1/5 12:12:12";
        Date parse = sdf.parse(str);
        System.out.println(parse.getTime());
        /**Calendar类即日历类，常用于进行“翻日历”，比如下个月的今天是多久
         */
        Calendar instance = Calendar.getInstance();
        Date time = instance.getTime();
        System.out.println(time);
        System.out.println(instance.getTimeZone());
        /**add方法，在原日期上增加年/月/日
         set方法，直接设置年/月/日*/
        /**后两个月的今天*/
        instance.add(Calendar.MONTH,2);


    }
}
