package basic.latest.lambda;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/12 0012 13:26
 */
public class Demo6ListTest {
    public static void main(String[] args) {
        System.out.println("猪年大吉");
        /** 1 在这里，我们应该注意Collectors.toList()并不能保证返回的集合是准确的。
         对于返回的实例的可变性、可序列化性或线程安全性，一般没有约定。因此，
         我们的代码不应该依赖于这些属性。
         一些人强调说，Stream.of(…).collect(…) 可能比Arrays.asList()
         具有更大的内存和性能占用空间，但是在几乎所有情况下，
         它都是一个非常微小的优化，几乎没有什么区别。*/
        Set<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toSet());
        System.out.println(collect);
        long count = Stream.of(1, 2, 3, 3, 1, 9).sorted().limit(2).count();
        System.out.println(count);
        Stream<String> sorted = Stream.of("a", "b", "v", "c").sorted();
        System.out.println(sorted);
    }
}
