package basic.latest.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月22日 下午9:24:44 类说明：侵权必究。。。。。。。
 */

public class Demo1FilterList {
    public static void main(String[] args) {
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0, 40.0);
        List<Double> collect = cost.stream().filter(x -> x > 21).collect(Collectors.toList());
        collect.forEach(ppx -> System.out.println(ppx));
        /*
         * List<Double> asList = Arrays.asList(10.0, 21.0, 22.0);
         * asList.stream().map(ppx -> ppx + ppx * 0.09).forEach(ppx ->
         * System.out.println(ppx)); ;
         */
        /*


        /*
         * Random random = new Random(); List<Integer> list = new
         * ArrayList<>(100); list.add(random.nextInt(100));
         * list.add(random.nextInt(100)); list.add(random.nextInt(100));
         * list.add(random.nextInt(100)); list.add(random.nextInt(100));
         * list.add(random.nextInt(100)); list.add(random.nextInt(100));
         * list.add(random.nextInt(100)); list.add(random.nextInt(100));
         * list.add(random.nextInt(100)); list.add(random.nextInt(100));
         * list.add(random.nextInt(100)); list.forEach(p ->
         * System.out.println("集合中的元素是:" + p)); Set<Integer> set = new
         * HashSet<>(); set.add(random.nextInt(21000));
         * set.add(random.nextInt(21000)); set.add(random.nextInt(21000));
         * set.add(random.nextInt(21000)); set.add(random.nextInt(21000));
         * set.add(random.nextInt(21000)); set.add(random.nextInt(21000));
         * set.add(random.nextInt(21000)); set.add(random.nextInt(21000));
         * set.add(random.nextInt(21000)); set.add(random.nextInt(21000));
         * set.forEach(ppx -> System.out.println("set 中的集合是:" + ppx));
         */

        /*
         * List<Integer> primes = Arrays.asList(new Integer[] { 2, 3, 5, 7 });
         *
         * int a = 10; primes.forEach(b -> System.out.println(a * b));
         */
    }
    /*
     * List<String> asList = Arrays.asList("hello", "world", "remember!");
     * asList.forEach(a -> System.out.println(a)); // 获取数字的个数、最小值、最大值、总和以及平均值
     * List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
     * IntSummaryStatistics stats = primes.stream().mapToInt((x) ->
     * x).summaryStatistics(); IntSummaryStatistics ppx =
     * primes.stream().mapToInt((x) -> x).summaryStatistics();
     * System.out.println(ppx.getAverage()); System.out.println(
     * "Highest prime number in List : " + stats.getMax()); System.out.println(
     * "Lowest prime number in List : " + stats.getMin()); System.out.println(
     * "Sum of all prime numbers : " + stats.getSum()); System.out.println(
     * "Average of all prime numbers : " + stats.getAverage());
     * System.out.println(stats.getCount());
     */
}
