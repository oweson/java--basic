package pig.easyfalse;

import java.util.Calendar;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/20 0020 17:16
 */
public class Demo8PrintYesterday {
    public static void main(String[] args) {
        // 1 打印昨天的时间
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, -1);
        System.out.println(instance.getTime());
    }
}
