package basic.ocean.thread.safe;

import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/30 0030 14:59
 */
public class Demo1SafeThread {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(Arrays.asList(100, 2, 3));
        for (Integer integer : list) {
            System.out.println(integer);
        }
        // 不安全；
        System.out.println("------------------------------------------------------");
        HashSet set = new HashSet<Integer>(100);
        Map<Integer, Integer> map = new Hashtable<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, i + 1);
        }
        for (Map.Entry<Integer, Integer> next : map.entrySet()) {
            System.out.println(next.getKey() + "   :  " + next.getValue());
        }
    }
}
