package top.sea521.design.singleton;

/**
 * Created by geely
 */
public class Demo7ThreadLocalInstance {
    private static final ThreadLocal<Demo7ThreadLocalInstance> threadLocalInstanceThreadLocal
             = new ThreadLocal<Demo7ThreadLocalInstance>(){
        @Override
        protected Demo7ThreadLocalInstance initialValue() {
            return new Demo7ThreadLocalInstance();
        }
    };
    private Demo7ThreadLocalInstance(){

    }

    public static Demo7ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }

}
