package basic.lake.map.demo7treemap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/23 19:27
 */
public class Demo1TreeMap {
    /** 1 TreeMap 简介
     TreeMap 是一个有序的key-value集合，它是通过红黑树实现的。
     TreeMap 继承于AbstractMap，所以它是一个Map，即一个key-value集合。
     TreeMap 实现了NavigableMap接口，意味着它支持一系列的导航方法。比如返回有序的key集合。
     TreeMap 实现了Cloneable接口，意味着它能被克隆。
     TreeMap 实现了java.io.Serializable接口，意味着它支持序列化。
     TreeMap基于红黑树（Red-Black tree）实现。该映射根据其键的自然顺序进行排序，或者根据创建映射时提供的 Comparator 进行排序，具体取决于使用的构造方法。
     TreeMap的基本操作 containsKey、get、put 和 remove 的时间复杂度是 log(n) 。
     另外，TreeMap是非同步的。 它的iterator 方法返回的迭代器是fail-fastl的。*/


    /**
     * 2 TreeMap的构造函数
     * <p>
     * // 1 默认构造函数。使用该构造函数，TreeMap中的元素按照自然排序进行排列。
     * TreeMap()
     * // 2 创建的TreeMap包含Map
     * TreeMap(Map<? extends K, ? extends V> copyFrom)
     * // 3 指定Tree的比较器
     * TreeMap(Comparator<? super K> comparator)
     * // 4 创建的TreeSet包含copyFrom
     * TreeMap(SortedMap<K, ? extends V> copyFrom)
     */
    public static void main(String[] args) {
        /** 3 TreeMap的继承关系

         复制代码
         java.lang.Object
         ↳     java.util.AbstractMap<K, V>
         ↳     java.util.TreeMap<K, V>

         public class TreeMap<K,V>
         extends AbstractMap<K,V>
         implements NavigableMap<K,V>, Cloneable, java.io.Serializable {}*/

        /** 4 (01) TreeMap实现继承于AbstractMap，并且实现了NavigableMap接口。
         (02) TreeMap的本质是R-B Tree(红黑树)，它包含几个重要的成员变量： root, size, comparator。
         　　root 是红黑数的根节点。它是Entry类型，Entry是红黑数的节点，它包含了红黑数的6个基本组成成分：key(键)、value(值)、left(左孩子)、right(右孩子)、parent(父节点)、color(颜色)。Entry节点根据key进行排序，Entry节点包含的内容为value。
         　　红黑数排序时，根据Entry中的key进行排序；Entry中的key比较大小是根据比较器comparator来进行判断的。
         　　size是红黑数中节点的个数。*/


        Map<String, Integer> map = new HashMap();
        map.put("a", 21);
        map.put("f", 21);
        map.put("q", 21);
        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
        // 1 a,q,f
        Map<String, Integer> treeMap = new TreeMap();
        treeMap.put("c", 21);
        treeMap.put("d", 21);
        treeMap.put("g", 21);
        treeMap.put("q", 21);
        treeMap.put("p", 21);
        treeMap.put("n", 21);
        treeMap.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
        // treeMap  元素按照自然排序进行排列,也可以自定义排序！！！


    }
}
