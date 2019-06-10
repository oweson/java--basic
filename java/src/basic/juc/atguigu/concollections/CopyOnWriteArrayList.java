package basic.juc.atguigu.concollections;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/17 0017 7:12
 */
public class CopyOnWriteArrayList {
    public static void main(String[] args) {
        if (1 == 1) {
        }
        // 适合读多写少的并发场景；

        java.util.concurrent.CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(1);
        for (Integer integer : copyOnWriteArrayList) {
            System.out.println(integer);

        }
    }
}
