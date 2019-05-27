package top.sea521.design.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/21 0021 12:05
 */
public class Demo5ThreadLocal {
    private static final ThreadLocal<Demo5ThreadLocal> threadInsance
            = new ThreadLocal<Demo5ThreadLocal>() {
        /**匿名类；*/
        @Override
        protected Demo5ThreadLocal initialValue() {
            return new Demo5ThreadLocal();
        }
    };

    private Demo5ThreadLocal() {
    }

    public static Demo5ThreadLocal getInstance() {
        return threadInsance.get();
    }

}
