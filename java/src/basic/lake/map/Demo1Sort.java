package basic.lake.map;

import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/14 0014 13:13
 */
public class Demo1Sort {
    public void killRepeatElements() {

        Map map = new HashMap();
        System.out.println("");
        Date d = new Date();
        System.out.println("d = " + d);
        System.out.println(d);

        List<Integer> list = new ArrayList<Integer>();

        list.add(112);
        list.add(1112121);
        list.add(11);
        list.add(11);
        list.add(15);
        list.add(123);
        System.out.println("没有去重的集合:" + list);
        HashSet<Integer> set = new HashSet<Integer>();
        for (Integer i : list
                ) {
            set.add(i);

        }
        System.out.println("去除重复的内容" + set);
    }

    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        new Demo1Sort().killRepeatElements();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(112);
        list.add(1112121);
        list.add(11);
        list.add(11);
        list.add(15);
        list.add(123);
        System.out.println("没有去重的集合:" + list);


        List<Integer> list1 = new ArrayList<Integer>();
        for (Integer i : list
                ) {
            if (!list1.contains(i)) {
                list1.add(i);
            }

        }
        String s = "asa";
        if (s == null) {

        }
        for (Integer integer : list1) {

        }
        System.out.println("去除重复后的集合:" + list1);
    }
}
