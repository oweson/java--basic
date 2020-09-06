package basic.geeck;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chengwanli
 * @date 2020/9/6 11:39
 */


public class NpeTest {
   /* static {
        System.out.println(1/0);
    }*/
    public static int demo1(){
        Integer integer=null;
        return integer;
    }
    public static Integer demo2(){
        Integer integer=null;
        return integer;
    }
    public static void main(String[] args) {
        //System.out.println(demo1());
        demo2();
        Function<Integer, Double> integerDoubleFunction = Integer::doubleValue;
        double v = integerDoubleFunction.apply(21).doubleValue();
        System.out.println(v);
        List<Integer> collect = Stream.of(1, 2, 3).filter(item -> item.intValue() > 0).collect(Collectors.toList());
        System.out.println(collect);
        // 求总数
        System.out.println(collect.stream().collect(Collectors.summingInt(item -> item)));
// 求平均值
        System.out.println(collect.stream().collect(Collectors.averagingInt(Integer::intValue)));
        // 统计个数
        System.out.println(collect.stream().collect(Collectors.counting()));

        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        readWriteLock.getReadLockCount();
        collect.stream().forEach(System.out::println);

    }
}
