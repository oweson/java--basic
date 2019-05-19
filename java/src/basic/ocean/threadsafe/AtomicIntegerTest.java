package basic.ocean.threadsafe;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/4 0004 20:07
 */
public class AtomicIntegerTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(2019);
        int i = atomicInteger.incrementAndGet();
        System.out.println(i);
        atomicInteger.set(2015);
        // 得到然后加一！
        int andIncrement = atomicInteger.getAndIncrement();
        System.out.println(andIncrement);
        System.out.println(atomicInteger);


    }
}
