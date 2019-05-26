package basic.pond.usualapi.demo02.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 11:47
 */
public class Demo03DateTest {
    public static final void dateFormat() throws ParseException {
        //创建SimpleDateFormat对象df1,指定日期模式为yyyy-MM-dd
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        //调用df1的parse(String str)方法传入2018-03-04,得到对应日期类型
        Date date = df1.parse("2018-03-04");
        //创建日期格式化对象df2,在获取格式化对象时可以指定风格
        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日");
        //调用df2的format(Date date) 传入刚才转换的日期
        String str = df2.format(date);
        System.out.println(str);
    }
    public static void main(String[] args) {
        //获取当前日期对象 now;
        Date now = new Date();
        //创建SimpleDateFormat对象 df,并制定日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调用df的format(Date  date) 方法,传入now; 接收返回的字符串
        String datestr = df.format(now);
        //打印这个字符串
        System.out.println(datestr);
    }
}
