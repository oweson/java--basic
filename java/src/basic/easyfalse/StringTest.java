package basic.easyfalse;

import java.util.Date;

public class StringTest {
    public static final String MESSAGE = "taotao";

    public static void main(String[] args) {
        String aString = "tao" + "tao";
        System.out.println(MESSAGE == aString);
        // 因为字符串常量池；
        //todo 重点
        String aa = "tao";
        String bb = "tao";
        System.out.println(MESSAGE == (aa + bb));
        // false
        System.out.println(MESSAGE == (aa + bb).intern());
        // intern()回在产量吃中查找没有在赋值，所以为true;
        String s = "hello";
        String s2 = "he" + "llo";
        /**true*/
        System.out.println(s == s2);
        String s3 = "hello";
        String s4 = "he" + new String("llo");
        /**false*/
        System.out.println(s3 == s4);
        // false
        System.out.println("--------------------------------");
        /**string在常亮里面是不可以变的*/
        String oppo = "fmn";
        /**生成新的对象，但是没有任何引用指向他*/
        oppo.toLowerCase();
        /**生成新的对象，y指向他*/
        String y = oppo.replace('f', 'F');
        y += "wxy";
        System.out.println(y);


    }

}
