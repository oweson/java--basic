package pig.zhongwang;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author oweson
 * @date 2020/10/22 15:26
 */


public class HashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(integers);
        integers.clear();
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            integerHashSet.add(i);
        }
        System.out.println(integerHashSet);

        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
        for (int i = 0; i < 1000; i++) {
            integerIntegerHashMap.put(i,i+1);
        }
        System.out.println(integerIntegerHashMap);
    }
}
