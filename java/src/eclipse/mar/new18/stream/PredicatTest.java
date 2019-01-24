package eclipse.mar.new18.stream;

import org.junit.Test;

import java.util.function.Predicate;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 10:31
 */
public class PredicatTest {
    @Test
    public void demo1() {
        Integer[] arr = {-12345, 9999, 520, 0, -38, -7758520, 941213};

        //a)   使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数
        Predicate<Integer> p1 = (s) -> s >= 0;
        System.out.println(p1);

    }

    public static void main(String[] args) {
        //a)   使用lambda表达式创建Predicate对象p1,p1能判断整数是否是自然数

        Integer[] arr = {-12345, 9999, 520, 0, -38, -7758520, 941213};
        Predicate<Integer> p1 = (s) -> s >= 0;

        //b)   使用lambda表达式创建Predicate对象p2,p2能判断整数的绝对值是否大于100
        Predicate<Integer> p2 = (s) -> Math.abs(s) > 100;
        //c)   使用lambda表达式创建Predicate对象p3,p3能判断整数是否是偶数
        Predicate<Integer> p3 = (s) -> s % 2 == 0;

        //e)   遍历arr，仅利用已创建的Predicate对象(不使用任何逻辑运算符)，完成以下需求
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (Integer i : arr) {
            //统计自然数个数
            if (p1.test(i)) {
                count1++;
            }
            //统计负整数个数
            if (p1.negate().test(i)) {
                count2++;
            }
            //统计绝对值大于100的偶数个数
            if (p2.and(p3).test(i)) {
                count3++;
            }
            //统计是负整数或偶数的数的个数
            if (p1.negate().or(p3).test(i)) {
                count4++;
            }
        }
        //分别打印结果
        System.out.println("自然数的个数为：" + count1);
        System.out.println("负整数的个数为：" + count2);
        System.out.println("绝对值大于100的偶数的个数为：" + count3);
        System.out.println("是负整数或偶数的数的个数为：" + count4);
    }
}

