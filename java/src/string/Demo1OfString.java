package string;


/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月27日 下午7:17:13 类说明：侵权必究。。。。。。。
 */

public class Demo1OfString {
    static void demo1() {
        String string = " aaa ";
        System.out.println(string.trim().length());
        // 去掉空格；
    }

    public static void main(String[] args) {
        demo1();
        String string = "java is a super langage,haha,hello,world";
        System.out.println(string.length());
        System.out.println(string.indexOf("java"));
        System.out.println(string.charAt(8));
        String[] split = string.split(" ,");
        for (String string2 : split) {
            System.out.println(string);

        }
        // TODO Auto-generated method stub

    }

}
