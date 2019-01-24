package eclipse.mar.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 12:16
 */
public class ListToArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.println(object);

        }
    }
}
