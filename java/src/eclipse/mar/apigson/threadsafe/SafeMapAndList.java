package eclipse.mar.apigson.threadsafe;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/4 0004 19:38
 */
public class SafeMapAndList {
    public static void main(String[] args) {
        // 1 把不安全的集合加锁，编程线程安全的集合
        Collections.synchronizedMap(null);
        Collections.synchronizedList(null);
        Collections.synchronizedSet(null);
        Collections.synchronizedSortedSet(null);
        // 2 并发集合
        Map map = new ConcurrentHashMap<String,String>();
        /**ConcurrentHashMap和Hashtable之间的区别
         那么Hashtable和ConcurrentHashMap之间的区别是什么，可以在多线程环境中使用，但一旦Hashtable的大小变得相当大的性能降低，因为迭代它必须被锁定更长的时间。

         由于ConcurrentHashMap引入了分段的概念，所以它只有一部分被锁定才能提供线程安全性.

         总而言之，ConcurrentHashMap仅锁定Map的某些部分，而Hashtable在执行迭代时锁定完整映射。

         ConcurrentHashMap和Collections.synchronizedMap之间的区别
         ConcurrentHashMap旨在实现并发性能，提高性能，而通过使用synchronized Map应用包装器，可以同步自然不同步的HashMap。

         以下是ConcurrentHashMap和Java中的同步映射之间的一些常见区别
         ConcurrentHashMap 不允许空值或空值同步,但是HashMap允许一个空键。


         =========================================================================
         ynchronized vs Concurrent Collections
         不管是同步集合还是并发集合他们都支持线程安全，他们之间主要的区别体现在性能和可扩展性，还有他们如何实现的线程安全。同步HashMap, Hashtable, HashSet, Vector, ArrayList 相比他们并发的实现（比如：ConcurrentHashMap, CopyOnWriteArrayList, CopyOnWriteHashSet）会慢得多。造成如此慢的主要原因是锁， 同步集合会把整个Map或List锁起来，而并发集合不会。并发集合实现线程安全是通过使用先进的和成熟的技术像锁剥离。比如ConcurrentHashMap 会把整个Map 划分成几个片段，只对相关的几个片段上锁，同时允许多线程访问其他未上锁的片段。

         同样的，CopyOnWriteArrayList 允许多个线程以非同步的方式读，当有线程写的时候它会将整个List复制一个副本给它。

         如果在读多写少这种对并发集合有利的条件下使用并发集合，这会比使用同步集合更具有可伸缩性。

         顺便说一下，集合类是Java API的核心，所以我觉得明智而审慎地使用它们是一门艺术。这是我的个人经验,我通过使用ArrayList替换遗留代码里使用的Vector来提高性能。JDK 1.5引入一些很好的并发集合能高效地开发高容量,低延迟的Java应用程序。

         Synchronized Collections vs Concurrent Collections in Java
         同步集合类，Hashtable 和 Vector 还有同步集合包装类，Collections.synchronizedMap()和Collections.synchronizedList() 提供了一个基本的有条件的线程安全的Map和List的实现。

         所以Hashtable和ConcurrentHashMap的区别是什么,他们都可以在多线程环境中使用，但一旦Hashtable 的大小变得相当大的时候，其性能会降低,因为迭代的时候会被长时间锁定。

         然而有一些因素导致他们不适合在高并发应用程序中使用，最主要的原因是在他们的‘集合范围’的锁是程序可伸缩性的一个阻碍。它往往成为必须在相当长一段时间内对集合加锁以防止在迭代期间出现ConcurrentModificationException。



         ConcurrentHashMap和CopyOnWriteArrayList不一定在所有地方都是有用的，一般情况下你只需要使用HashMap或ArrayList。

         因为ConcurrentHashMap 引入了分片的概念，所以无论集合有多大，她都只对特定的片段进行加锁以保障线程安全，其他的读线程仍然可以访问map而不用等待正在访问的线程遍历结束。

         */
    }
}
