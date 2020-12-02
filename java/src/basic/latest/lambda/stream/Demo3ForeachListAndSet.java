package basic.latest.lambda.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月22日 下午9:15:52 类说明：侵权必究。。。。。。。
 */

public class Demo3ForeachListAndSet {
    public static void main(String[] args) {
        List<String> asList = Arrays.asList("Lambdas", "Default Method", "Stream API");
        asList.forEach(System.out::println);
        System.out.println("----------------------------------------------------------");
        Set<Integer> set = new HashSet<>(16);
        set.add(10);
        set.add(21);
        /* 这两种方法都是一样的！！！*/
        set.forEach(pp -> System.out.println(pp));
        set.forEach(System.out::println);

    }

}
