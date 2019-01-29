package eclipse.mar.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 15:29
 */
public class ListTransgerArrays {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(210);
        for (int i = 0; i < 210; i++) {
            list.add(i);
        }
        String[] s = {"hello,world", "asaas"};
        List<String> list1 = Arrays.asList(s);
        //list1.add("21");ava.lang.UnsupportedOperationException
        //  list1.remove(1);java.lang.UnsupportedOperationException
        System.out.println(list1);
    }
}
