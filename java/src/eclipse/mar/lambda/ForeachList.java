package eclipse.mar.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月22日 下午9:15:52 类说明：侵权必究。。。。。。。
 */

public class ForeachList {
    public static void main(String[] args) {
        List<String> asList = Arrays.asList("Lambdas", "Default Method", "Stream API");

        asList.forEach(System.out::println);
        asList.forEach(n -> System.out.println(n));

    }

}
