package basic.lake.collections;

import java.util.Random;
import java.util.TreeSet;

public class RandomSortArray {

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
        // 得到集合的大小;

        Integer array[] = new Integer[size];
        // 得到同等的数组大小；
        t.toArray(array);
        // 获取集合中的数组：
        for (int value : array) {
            System.out.println(value);
        }


    }

}
