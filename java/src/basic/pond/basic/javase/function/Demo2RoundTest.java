package basic.pond.basic.javase.function;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/1 0001 15:32
 */
public class Demo2RoundTest {
    // 定义round方法,参数为(double d) , 返回值int
    public static int round(double d) {
        // round方法中,d+0.5后,转换为int类型,并返回.
        int n = (int) (d + 0.5);
        /**注意临界值！！！*/
        return n;
    }

    public static void main(String[] args) {
        System.out.println(10.1 + "->" + round(10.1));
        System.out.println(10.4 + "->" + round(10.4));
        System.out.println(10.5 + "->" + round(10.5));
        System.out.println(10.9 + "->" + round(10.9));
        System.out.println("------------------");
        System.out.println(Math.round(10.1));
        System.out.println(Math.round(10.5));
    }
}
