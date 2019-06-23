package basic.latest.lambda.stream;

import java.util.Comparator;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月16日 上午7:24:27 类说明：侵权必究。。。。。。。
 */

public class Demo8TestLambda {

    public static void main(String[] args) {

        /* 1 jdk1.8新特性lambda的简单使用 */
        /*
         * Runnable r2 = () -> System.out.println("Hello Lambda!!"); r2.run();
         * Runnable pRunnable = () -> System.out.println("hello,world");
         * pRunnable.run(); Demo1ComparatorTest<Integer> comparator = (x, y) -> {
         * System.out.println("lambda的输出........."); return Integer.compare(x,
         * y); }; System.out.println(comparator.compare(10, 21));
         */
        // 2语法格式四：若 Lambda 体中只有一条语句， return 和 大括号都可以省略不写
        /*
         * Demo1ComparatorTest<Integer> comparator = (x, y) -> Integer.compare(x, y);
         * System.out.println(comparator.compare(1, 2));
         */
        /*
         * 语法格式五：Lambda
         * 表达式的参数列表的数据类型可以省略不写，因为JVM编译器通过上下文推断出，数据类型，即“类型推断”（参数如果写就都写上去，
         * 不能写一部分空一部分） 作者： 链接：https://www.imooc.com/article/19671 来源：慕课网
         */
        Comparator<Integer> comparator = (x, y) -> Integer.compare(x, y);
        System.out.println(comparator.compare(1, 2));
    }

}
