package basic.latest.lambda.stream;

import java.util.ArrayList;
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
        collect.forEach(System.out::println);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        List<Integer> collectInteger = integerList.stream().filter(integer -> integer == 1).collect(Collectors.toList());
        System.out.println(collectInteger);


    }
}
