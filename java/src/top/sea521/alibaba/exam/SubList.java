package top.sea521.alibaba.exam;

import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        List<Integer> subList = integerList.subList(0, 2);
//        subList.add(4);
        integerList.add(21);
        System.out.println(integerList);
        System.out.println(subList);
        // 1 对截取的进行操作会影响原来的！！！本身不会变化；
        // 2 原来的不可以添加：java.util.ConcurrentModificationException
        // 3 select count(null) from card;  0
        // 4 sum(null) null
        // 5 select null<>1;  null

    }
}
