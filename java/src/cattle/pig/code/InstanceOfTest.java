package cattle.pig.code;

import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:30
 */
public class InstanceOfTest {
    public static void main(String[] args) {
        List Listlist1 = new ArrayList();
        Listlist1.add(0);
        List Listlist2 = Listlist1;
        System.out.println(Listlist1.get(0) instanceof Integer);
        System.out.println(Listlist2.get(0) instanceof Integer);
        /**解析：
         * collection类型的集合（ArrayList,LinkedList）只能装入对象类型的数据，
         * 该题中装入了0，是一个基本类型，但是JDK5以后提供了自动装箱与自动拆箱，所以int类型自动装箱变为了Integer类型。编译能够正常通过。
         * 将list1的引用赋值给了list2，那么list1和list2都将指向同一个堆内存空间。
         * instanceof是Java中关键字，用于判断一个对象是否属于某个特定类的实例，
         * 并且返回boolean类型的返回值。
         * 显然，list1.get(0)和list2.get(0)都属于Integer的实例
         * */
    }
}
