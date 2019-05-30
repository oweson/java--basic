package basic.lake.collection.demo01.List;

import java.util.Arrays;
import java.util.List;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月17日 下午8:37:54 类说明：侵权必究。。。。。。。
 */

public class Demo10NoRealArrayList {
    public static void main(String[] args) {
        List<String> asList = Arrays.asList("a");
        asList.add("23");
        /** 并不是真正的集合,是集合的内部类，注意！！！*/
        System.out.println(asList);
    }
}
