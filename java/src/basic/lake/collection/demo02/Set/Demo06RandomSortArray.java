package basic.lake.collection.demo02.Set;

import java.util.Random;
import java.util.TreeSet;

public class Demo06RandomSortArray {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Random r = new Random();
        TreeSet<Integer> t = new TreeSet<Integer>();
        int count = 0;
        while (count < 10) {
            boolean success = t.add(r.nextInt(100));

            if (success) {
                count++;
            }

        }
        int size = t.size();
        // 1 得到集合的大小;集合转数组两种方法，有参和无参的，有参数的需要传递一个数组进行接受！

        Integer array[] = new Integer[size];
        // 2 得到同等的数组大小；
        Integer[] integers = t.toArray(array);
        // 3 获取数组的元素并且变量：
        for (int value : array) {
            System.out.println(value);
        }
       /* List list = new ArrayList<>();
        list.add(100);
        list.add(1000000);
        list.toArray();
*/

    }

}
