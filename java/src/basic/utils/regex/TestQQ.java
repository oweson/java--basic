package basic.utils.regex;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/2 0002 22:36
 */
public class TestQQ {
    public static void main(String[] args) {
        String qq="570347720";
        /**第一位只能是0-9的数子
         * 第二位只能是0=9
         * {}数字的范围
         * 范围前开后闭
         * \\d匹配0-9的数字
         * \\D和d去反,匹配不是数字的字符串*/
        boolean matches = qq.matches("[1-9][0-9]{4,5}");
        boolean matches02 = qq.matches("[1-9][\\d]{4,9}");
        boolean matches03 = qq.matches("[1-9][\\D]{4,9}");
        System.out.println(matches);
        System.out.println(matches02);
        System.out.println(matches03);
        //匹配手机号
        String tel="1579762214891";
        /**第一位为1
         * 第二位在范围中
         * 第3-11为0-9的整数
         * 出现9次*/
        boolean matches1 = tel.matches("1[345678][\\d]{9}");
        System.out.println(matches1);
    }
}
