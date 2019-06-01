package top.sea521.design.singleton;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 18:26
 */
public class Demo8IInnerClassInstance {
    private static class LazyPig {
        public static final Demo8IInnerClassInstance INSTANCE = new Demo8IInnerClassInstance();

    }

    private Demo8IInnerClassInstance() {
    }

    public static final Demo8IInnerClassInstance getInstance() {
        return LazyPig.INSTANCE;
    }

    public static void main(String[] args) {
        /**单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，
         * 这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，
         * JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，这样我们就不用担心上面的问题。
         * 同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。这样我们暂时总结一个完美的单例模式：*/
        Demo8IInnerClassInstance instance = Demo8IInnerClassInstance.getInstance();
        Demo8IInnerClassInstance instance02 = Demo8IInnerClassInstance.getInstance();
        System.out.println(instance);
        System.out.println(instance02);

    }
}
