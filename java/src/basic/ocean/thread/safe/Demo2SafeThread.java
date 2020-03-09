package basic.ocean.thread.safe;

import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/30 0030 15:18
 */
public class Demo2SafeThread {
    public static void main(String[] args) {
        // 1 读多写少的并发场景；
        List list = new CopyOnWriteArrayList();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        System.out.println(list.size());
        // 2 跳表
        ConcurrentSkipListMap concurrentSkipListMap = new ConcurrentSkipListMap();
        for (int i = 0; i < 100; i++) {
            concurrentSkipListMap.put(i, i + 1);

        }

    }
}
