package top.sea521.compariable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 20:05
 */
public class ComparatorMainTest {
    /**
     * 总结：
     * TreeSet仅能根据创建时实现的comparable接口（内部比较器）进行排序，
     * 且HashSet不支持内部比较器，工具类Collections.sort()方法仅能对List排序。
     * TreeSet—使用— 内部比较器
     * List—使用—外部比较器
     * 在一个类没有提供比较器时或提供的比较器不适用时，就需要使用外部比较器
     * （例如：拿到一个jar包但它的类没比较器，总不能反编译去改代码）
     */
    public static void main(String[] args) {
        /**外部比较器：需比较的类不做任何实现，
         * 该类通过工具类Collections调用sort方法传入一个实现了接口 Comparator的类和一个List*/
        List<Bird> list = new ArrayList<>(10);
        list.add(new Bird(21, "ppx"));
        list.add(new Bird(20, "app"));
        list.add(new Bird(23, "vivo"));
        list.add(new Bird(20, "nubia"));
        list.add(new Bird(210, "honor"));
        list.add(new Bird(99, "pps"));
        Collections.sort(list, new Demo1ComparatorTest());
        //传入list和比较器排序
        for (Bird bird : list) {
            System.out.println(bird);

        }
    }
}
