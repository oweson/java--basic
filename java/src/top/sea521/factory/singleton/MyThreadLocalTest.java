package top.sea521.factory.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/21 0021 12:05
 */
public class MyThreadLocalTest {
    private static final ThreadLocal<MyThreadLocalTest> threadInsance
            = new ThreadLocal<MyThreadLocalTest>() {
        /**匿名类；*/
        @Override
        protected MyThreadLocalTest initialValue() {
            return new MyThreadLocalTest();
        }
    };

    private MyThreadLocalTest() {
    }

    public static MyThreadLocalTest getInstance() {
        return threadInsance.get();
    }

}
