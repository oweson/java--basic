package top.sea521.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/30 20:33
 */
public class UtilsTest {
    public static void main(String[] args) {
        int min = Math.min(1, 10);
        System.out.println(min);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        List<Integer> list1 = list.subList(0, 6);
        System.out.println(list1);
    }
}
