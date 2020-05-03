package basic.lake;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentSkipListMap;

public class Demo2SkipMap {
    public static void main(String[] args) {
        ConcurrentSkipListMap concurrentSkipListMap = new ConcurrentSkipListMap();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(21);
        System.out.println(queue);
        // 清除所有
        queue.remove();
        System.out.println(queue);
        queue.clear();
        // 已经过的天数
        System.out.println(LocalDate.now().getDayOfYear());

    }
}
