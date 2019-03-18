package pig.daoyun;


import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/18 0018 16:09
 */
public class Demo1 {
    // 1 哪些类不可继承？Integer，Double,ArrayList todo
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("A");
        list.add(2,"b");
        String s = (String) list.get(1);
        // java.lang.IndexOutOfBoundsException: Index: 2, Size: 1
        System.out.println(s);
        assertSth();


    }

    private static void assertSth() {
        List<Map<Integer,String>> list = new ArrayList<>(100);

    }

}
