package eclipse.mar.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/20 0020 19:01
 */
public class Demo15Thread {
    public static void main(String[] args) {
        /** 1 ，分别是继承线程类,实现Runnable接口,匿名类*/
        /** 2 Thread.sleep(1000); 表示当前线程暂停1000毫秒 ，其他线程不受影响
         Thread.sleep(1000); 会抛出InterruptedException 中断异常，因为当前线程sleep的时候，有可能被停止，
         这时就会抛出 InterruptedException*/
        /** 3 在42行执行t.join，即表明在主线程中加入该线程。
         主线程会等待该线程结束完毕， 才会往下运行。*/
        /** 4 如果一家公司销售部，生产部都解散了，那么只剩下后勤和行政，那么这家公司也可以解散了。

         守护线程就相当于那些支持部门，如果一个进程只剩下守护线程，那么进程就会自动结束。

         守护线程通常会被用来做日志，性能统计等工作。*/
        /** 5 多线程的同步问题指的是多个线程同时修改一个数据的时候，可能导致的问题

         多线程的问题，又叫Concurrency 问题*/
        /** 6 synchronized表示当前线程，独占 对象 someObject
         当前线程独占 了对象someObject，如果有其他线程试图占有对象someObject，就会等待，直到当前线程释放对someObject的占用。
         someObject 又叫同步对象，所有的对象，都可以作为同步对象
         为了达到同步的效果，必须使用同一个同步对象

         释放同步对象的方式： synchronized 块自然结束，或者有异常抛出*/
        /** 7 对象 someObject在同一时间，只能被一个线程占有。 间接地，导致同一时间，hp只能被一个线程修改。*/
        /** 8 既然任意对象都可以用来作为同步对象，而所有的线程访问的都是同一个hero对象，索性就使用gareen来作为同步对象
         进一步的，对于Hero的hurt方法，加上：
         synchronized (this) {
         }
         表示当期对象为同步对象，即也是gareen为同步对象*/
        /** 9 在recover前，直接加上synchronized ，其所对应的同步对象，就是this
         和hurt方法达到的效果是一样
         外部线程访问gareen的方法，就不需要额外使用synchronized 了*/
        /** 10 如果一个类，其方法都是有synchronized修饰的，那么该类就叫做线程安全的类

         同一时间，只有一个线程能够进入 这种类的一个实例 的去修改数据，进而保证了这个实例中的数据的安全(不会同时被多线程修改而变成脏数据)

         比如StringBuffer和StringBuilder的区别
         StringBuffer的方法都是有synchronized修饰的，StringBuffer就叫做线程安全的类
         而StringBuilder就不是线程安全的类*/
        /** 11 HashMap和Hashtable都实现了Map接口，都是键值对保存数据的方式
         区别1：
         HashMap可以存放 null
         Hashtable不能存放null
         区别2：
         HashMap不是线程安全的类
         Hashtable是线程安全的类*/
        /** 12 Buffer 是线程安全的
         StringBuilder 是非线程安全的

         所以当进行大量字符串拼接操作的时候，如果是单线程就用StringBuilder会更快些，如果是多线程，
         就需要用StringBuffer 保证数据的安全性*/
        /**13 Vector是线程安全的类，而ArrayList是非线程安全的。*/
        /**14 ArrayList是非线程安全的，换句话说，多个线程可以同时进入一个ArrayList对象的add方法

         借助Collections.synchronizedList，可以把ArrayList转换为线程安全的List。

         与此类似的，还有HashSet,LinkedList,HashMap等等非线程安全的类，都通过工具类Collections转换为线程安全的*/
       /* List<Integer> list = new ArrayList<>();
                list.add(1);
        List<Integer> list1 = Collections.synchronizedList(list);
        for (Integer integer : list1) {
            System.out.println(integer);

        }*/
       /** 15 1. 线程1 首先占有对象1，接着试图占有对象2
        2. 线程2 首先占有对象2，接着试图占有对象1
        3. 线程1 等待线程2释放对象2
        4. 与此同时，线程2等待线程1释放对象1
        就会。。。一直等待下去，直到天荒地老，海枯石烂，山无棱 ，天地合。。。*/
       /** 16 wait方法和notify方法，并不是Thread线程上的方法，它们是Object上的方法。

        因为所有的Object都可以被用来作为同步对象，所以准确的讲，wait和notify是同步对象上的方法。

        wait()的意思是： 让占用了这个同步对象的线程，临时释放当前的占用，并且等待。 所以调用wait是有前提条件的，一定是在synchronized块里，否则就会出错。

        notify() 的意思是，通知一个等待在这个同步对象上的线程，你可以苏醒过来了，有机会重新占用当前对象了。

        notifyAll() 的意思是，通知所有的等待在这个同步对象上的线程，你们可以苏醒过来了，有机会重新占用当前对象了。*/
       /** 17 每一个线程的启动和结束都是比较消耗时间和占用资源的。

        如果在系统中用到了很多的线程，大量的启动和结束动作会导致系统的性能变卡，响应变慢。

        为了解决这个问题，引入线程池这种设计思想。

        线程池的模式很像生产者消费者模式，消费的对象是一个一个的能够运行的任务*/
       /** 18 与synchronized类似的，lock也能够达到同步的效果
        与 synchronized (someObject) 类似的，lock()方法，表示当前线程占用lock对象，一旦占用，其他线程就不能占用了。
        与 synchronized 不同的是，一旦synchronized 块结束，就会自动释放对someObject的占用。 lock却必须调用unlock方法进行手动释放，为了保证释放的执行，往往会把unlock() 放在finally中进行。*/
       /**19 */
    }
}
