package basic.ocean.thread.safe;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/30 0030 17:43
 */
public class Demo3ThreadSafeCache {
    int result;
    public int getResult() {
        return result;
    }

    /**
     * 多线程并发的同时进行set、get操作，A线程调用set方法，B线程并不一定能对这个改变可见！！！
     * 这个类非常简单，里面有一个属性，有2个方法：get、set方法，
     * 一个用来设置属性值，一个用来获取属性值，在设置属性方法上面加了synchronized。
     * 隐式信息：多线程并发的同时进行set、get操作，A线程调用set方法，B线程可以里面感知到吗？？？
     * 说到这里，问题就变成了synchronized在刚刚说的上下文下面能否保证可见性！！！
     *  关键词synchronized的用法
     * 指定加锁对象:对给定对象加锁，进入同步代码前需要获得给定对象的锁。
     * 直接作用于实例方法:相当于对当前实例加锁，进入同步代码前要获得当前实例的锁。
     * 直接作用于静态方法:相当于对当前类加锁，进入同步代码前要获得当前类的锁。
     * synchronized它的工作就是对需要同步的代码加锁，使得每一次只有一个线程可以进入同步块（其实是一种悲观策略）从而保证线程之间得安全性。
     *
     * 从这里我们可以知道，我们需要分析的属于第二类情况，也就是说多个线程如果同时进行set方法的时候，
     * 由于存在锁，所以会一个一个进行set操作，并且是线程安全的，但是get方法并没有加锁，
     * 表示假如A线程在进行set的同时B线程可以进行get操作。
     * 并且可以多个线程同时进行get操作，但是同一时间最多只能有一个set操作。
     * volatile可见性
     *
     * 前面happens-before原则就提到：volatile 变量规则：
     * 对一个 volatile 域的写，happens-before 于任意后续对这个 volatile 域的读。
     * volatile从而保证了多线程下的可见性！！！
     */
    public synchronized void setResult(int result) {
        this.result = result;
    }
}
