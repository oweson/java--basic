package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/5 0005 18:04
 */
public class Demo1Test {
    /** 1 ConcurrentHashMap使用synchronized关键字保证线程安全
     HashMap实现了Collection接口
     Arrays.asList方法返回java.util.ArrayList对象
     SimpleDateFormat对象是线程不安全的
     D 对的；
     answer:hashMap在单线程中使用大大提高效率，在多线程的情况下使用hashTable来确保安全。
     hashTable中使用synchronized关键字来实现安全机制，
     但是synchronized是对整张hash表进行锁定即让线程独享整张hash表，
     在安全同时造成了浪费。concurrentHashMap采用分段加锁的机制来确保安全;

     2 Arrays.asList()
     将一个数组转化为一个List对象，这个方法会返回一个ArrayList类型的对象，
     这个ArrayList类并非java.util.ArrayList类，而是Arrays类的静态内部类！
     用这个对象对列表进行添加删除更新操作，就会报UnsupportedOperationException异常。


     3 ConcurrentHashMap使用segment来分段和管理锁，segment继承自ReentrantLock，
     因此ConcurrentHashMap使用ReentrantLock来保证线程安全。*/

}
