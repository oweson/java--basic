package basic.lake.collection.demo01.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 12:05
 */
public class Demo07CountOneInList {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        countInList(list, "a");


    }

    private static void countInList(Collection<String> list, String a) {
        int count = 0;
        for (String s : list) {
            if (a.equalsIgnoreCase(s)) {
                count++;
            }

        }
        System.out.println(a + "出现了：" + count);


    }
}
