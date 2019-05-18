package basic.offier.practice.error;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/29 0029 22:36
 */
public class TestArraysList {
    @Test
    public void test1() {
        List<String> list = Arrays.asList("aaa", "bbb");
        List<Integer> list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        // list1.add("asa");
        /**这是不允许的*/
        list1.add(22);
        //list1.addAll(list);
        /**不允许的*/
        //boolean add = list2.add(list);
        boolean b = list2.addAll(list);
        System.out.println(list2);


    }
}
