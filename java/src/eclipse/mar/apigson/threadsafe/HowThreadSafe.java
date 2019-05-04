package eclipse.mar.apigson.threadsafe;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/4 0004 20:03
 */
public class HowThreadSafe {
    /** 1 可以通过volatile、synchronized、lock保证有序性。volatile不是原子性的，进行++操作不是安全的
     *  2 */
    public static void main(String[] args) {
        /** 1. 多实例、或者是多副本（ThreadLocal）：
         * 对应着思路2，ThreadLocal可以为每个线程的维护一个私有的本地变量，可参考java线程副本–ThreadLocal；
         2. 使用锁机制 synchronize、lock方式：为资源加锁，可参考我写的一系列文章；
         3. 使用 java.util.concurrent 下面的类库：有JDK提供的线程安全的集合类*/
    }
}
