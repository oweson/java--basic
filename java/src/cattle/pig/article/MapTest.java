package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 11:40
 */
public class MapTest {
    /**1 线程安全的map在JDK 1.5及其更高版本环境 有哪几种方法可以实现?
     正确答案: C D   你的答案: C D
     Map map = new HashMap()
     Map map = new TreeMap()
     Map map = new ConcurrentHashMap();
     Map map = Collections.synchronizedMap(new HashMap());
     解析：HashMap,TreeMap是线程不安全的。 HashTable 和 ConcurrentHashMap 都是线程安全的。
     同时Collection类还提供了synchronized()方法，使得线程安全。*/
}
