package pig.zhongwang;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author chengwanli
 * @date 2020/10/19 22:38
 */


public class StaticTest {
    void say() {
        System.out.println("say");
    }

    static void eat() {
        StaticTest staticTest = new StaticTest();
        staticTest.say();
    }

    public static void main(String[] args) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        eat();
        System.out.println(Runtime.getRuntime().availableProcessors());

    }
}
