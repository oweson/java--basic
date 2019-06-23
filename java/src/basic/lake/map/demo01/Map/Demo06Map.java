package basic.lake.map.demo01.Map;

import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/31 0031 10:01
 */
public class Demo06Map {
    public void demo1() {
        // 锁可以是匿名的对象
        synchronized (new Date()) {
        }
    }

    public static void main(String[] args) {
        System.out.println(1 << 20);
        //  1 抽象类
        AbstractMap abstractMap = new HashMap();
        //  2 abstractmap的子类，其父类是抽象类
        HashMap hashMap = new HashMap();
        // 1 hashmap的子类
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        // 2 hashtable的子类
        Properties properties = new Properties();

        // 1 SortedMap接口被下面的继承了
        NavigableMap navigableMap = new TreeMap();
        // 2 实现了NavigableMapj接口；
        TreeMap treeMap = new TreeMap();

    }
}
