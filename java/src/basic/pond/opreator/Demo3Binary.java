package basic.pond.opreator;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月25日 下午9:01:35
 * 类说明：侵权必究。。。。。。。
 */

public class Demo3Binary {

    public static void main(String[] args) {
		/*示例 1 : 一个整数的二进制表达
位操作都是对二进制而言的，但是我们平常使用的都是十进制比如5。
而5的二进制是101。
所以在开始学习之前，需要掌握一个整数的二进制表达是多少。
通过Integer.toBinaryString() 方法，将一个十进制整数转换为一个二进制字符串*/
        String binaryString = Integer.toBinaryString(100).substring(0, 5);
        //前闭后开；
        System.out.println(binaryString);
        System.out.println(6 | 7);
        System.out.println(1 & 2);
        int a = 6;
        int b = 7;
        System.out.println(a | b);
        System.out.println(a & b);

    }

}
