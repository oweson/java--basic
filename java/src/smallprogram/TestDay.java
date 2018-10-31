package smallprogram;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月10日 下午6:44:37
 * 类说明：侵权必究。。。。。。。
 */

public class TestDay {
    public static void main(String[] args) {
        //Date 用法
        Date date = new Date();
        //System.out.printf("%tc%n",date);
        SimpleDateFormat str = new SimpleDateFormat("E  yyyy年MM月dd日   HH:mm:ss");
        String date1 = str.format(date);
        System.out.println(date1);
        //Calendar用法
        Calendar time = Calendar.getInstance();
        // 获得年份
        int year = time.get(Calendar.YEAR);
        // 获得月份
        int month = time.get(Calendar.MONTH) + 1;
        // 获得日期
        int date2 = time.get(Calendar.DATE);
        // 获得小时
        int hour = time.get(Calendar.HOUR_OF_DAY);
        // 获得分钟
        int minute = time.get(Calendar.MINUTE);
        // 获得秒
        int second = time.get(Calendar.SECOND);
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二，以此类推）
        int day = time.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println("星期:" + day + "  " + year + "年" + month + "月" + date2 + "日" + "  " + hour + ":" + minute + ":" + second);
    }

}
