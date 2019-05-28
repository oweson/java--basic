package basic.cloudcode;

import java.util.Calendar;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/28 0028 15:28
 */
public class Demo1UsefulCode {
    public static void reverseString(String str) {
        char[] chars = str.toCharArray();
        String sb = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            sb += chars[i];


        }
        System.out.println(sb);
    }
    public static void yesterday(){
        Calendar cal  =Calendar.getInstance();
        cal.add(Calendar.DATE,-1);
        System.out.println(cal);
    }

    public static void main(String[] args) {
        /**字符串的反转，借助StringBuilder!*/
        String s = "ppx";
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        System.out.println(s1);
        yesterday();


    }
}
