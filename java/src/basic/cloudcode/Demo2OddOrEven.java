package basic.cloudcode;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/5/30 0030 18:12
 */
public class Demo2OddOrEven {
    // true is odd;
    public static boolean isOdd(int i) {
        return i % 2 != 0;
    }

    public static void main(String[] args) {
        boolean odd = isOdd(100);
        System.out.println(odd);
        // false;
        // 浮点数产生的误差,不是0.9
        System.out.println(2.00 - 1.10);
    }
}
