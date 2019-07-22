package pig.easyfalse;

public class Demo10StringTest {
    public static final String MESSAGE = "taotao";

    public static void main(String[] args) {
        String aString = "tao" + "tao";
        System.out.println(MESSAGE == aString);
        // true
        // 1 因为字符串常量池；
        //todo 重点
        String aa = "tao";
        String bb = "tao";
        System.out.println(MESSAGE == (aa + bb));
        // 2 false 变量相加不在优化！！！
        System.out.println(MESSAGE == (aa + bb).intern());
        // 3  intern()回在产量吃中查找没有在赋值，所以为true;
        String s = "hello";
        String s2 = "he" + "llo";
        /** 4 true*/
        System.out.println(s == s2);
        String s3 = "hello";
        String s4 = "he" + new String("llo");
        /** 5 false*/
        System.out.println(s3 == s4);
        System.out.println("--------------------------------");
        /**string在常亮里面是不可以变的*/
        String oppo = "fmn";
        /** 1 生成新的对象，但是没有任何引用指向他*/
        oppo.toLowerCase();
        /** 2 生成新的对象，y指向他*/
        String y = oppo.replace('f', 'F');
        y += "wxy";
        System.out.println(y);


    }

}
