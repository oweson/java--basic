//package basic.pond.usualapi.demo04.Calendar;
//
//import java.util.Calendar;
//
///**
// * the class is create by @Author:oweson
// *
// * @Date：2019/5/26 0026 11:50
// */
//public class Demo03Calendar {
//    public static void main(String[] args) {
//        //创建Calendar对象
//        Calendar c = Calendar.getInstance();
//        //将给定的日历字段设置到Calendar对象中
//        c.set(Calendar.YEAR, 2019);
//        c.set(Calendar.MONTH, 1);
//        c.set(Calendar.DATE, 14);
//        //设置年
//        int year = c.get(Calendar.YEAR);
//        //设置月
//        int month = c.get(Calendar.MONTH) + 1;
//        //设置日
//        int date = c.get(Calendar.DATE);
//        //设置星期
//        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));
//        //输出结果
//        System.out.println(year + "年" + month + "月" + date + "日是星期" + week);
//    }
//
//    //定义方法，获取星期汉字
//    public static char getWeek(int a) {
//        char[] c = {' ', '日', '一', '二', '三', '四', '五', '六'};
//        return c[a];
//    }
//}
//
