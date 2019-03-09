package pig.unknow;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/6 0006 23:17
 */
public class ListPrint {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(100);
        list.add(1);
        list.add(2);
        for (Integer integer : list) {

        }
        // 1
        for (int i = 0; i < list.size(); i++) {

        }
        // 2
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()){
            Integer next = integerIterator.next();
            System.out.println(next);
        }
        // 3
    }
}
