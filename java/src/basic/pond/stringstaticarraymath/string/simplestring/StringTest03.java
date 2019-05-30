package basic.pond.stringstaticarraymath.string.simplestring;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 11:45
 */
public class StringTest03 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "abc";
        System.out.println(s1 == s2);
        //false
        System.out.println(s1.equals(s2));
        //true

        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);
        //true
        System.out.println(s3.equals(s4));
        //true

        String s5 = "a" + "b" + "c";
        // 编译器自动的优化！
        String s6 = "abc";
        System.out.println(s5 == s6);
        //true
        System.out.println(s5.equals(s6));

        //true

        String s7 = "ab";
        String s8 = "abc";
        String s9 = s7 + "c";
        System.out.println(s9 == s8);
        //false 不再优化！
        System.out.println(s9.equals(s8));
        //true
    }
}
