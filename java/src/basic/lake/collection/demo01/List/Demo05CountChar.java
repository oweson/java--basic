package basic.lake.collection.demo01.List;

import java.util.ArrayList;
import java.util.Collection;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 14:24
 */
public class Demo05CountChar {
    public static void main(String[] args) {
        /**统计某个数字出现的次数；*/
        Collection<Integer> collection = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                collection.add(i);
            }

        }
        countChar(collection, 1);
        countChar(collection, 2);
    }

    private static void countChar(Collection<Integer> collection, int i) {
        int count = 0;
        for (Integer integer : collection) {
            if (i == integer) {
                count++;
            }

        }
        System.out.println("一共：" + count);
    }
}
