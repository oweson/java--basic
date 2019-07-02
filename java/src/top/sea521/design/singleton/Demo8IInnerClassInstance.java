package top.sea521.design.singleton;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 18:26
 */
public class Demo8IInnerClassInstance {
    private static class LazyPig {
        //采用静态内部类的方式，作为单例，直接用classLoader(jVM 类加载机制)进行处理异步加锁的问题，并减小内存消耗
        public static final Demo8IInnerClassInstance INSTANCE = new Demo8IInnerClassInstance();
        /**这个解决方案被称为Lazy initialization
         holder class 模式，这个模式综合使用了java的类级内部类和多线程缺省同步锁的知识，
         很巧妙的同时实现了延迟加载和线程安全。

         1 相应的基础知识
         （1）什么是类级内部类？
         简单点说，类级内部类指的是，有static修饰的成员内部类。如果没有static修饰的成员式内
         部类被称为对象级内部类。
         （2）类级内部类相当于其外部类的static成分，它的对象与外部类对象间不存在依赖关系，因此
         可以直接创建。而对象级内部类的实例，是绑定在外部对象实例中的。
         （3）类级内部类中，可以定义静态的方法。在静态方法中只能引用外部类中的静态成员方法或变量。
         （4）类级内部类相当于其外部类的成员，只有在第一次被使用的时候才会被装载。

         多线程缺省同步锁的知识：
         大家都知道，在多线程开发中，为了解决并发问题，主要是通过使用synchronized来加互斥锁进行同步控制，
         但是在某些情况下，JVM已经隐含的为您执行了同步，这些情况下就不用自己再来进行同步控制了。
         这些情况包括：
         （1）由静态初始化器（在静态字段上或static{}块中的初始化器）初始化数据时
         （2）访问final字段时
         （3）在创建线程之前创建对象时
         （4）线程可以看见它将要处理的对象时

         2 解决方案的思路
         （1）要想很简单的实现线程安全，可以采用静态初始化器的方式，它可以由JVM来保证线程的安全性。比如前面的饿汉式实现方式。但是这样一来，不是会浪费一定的空间吗？因为这种实现方式，会在类装载的时候就初始化对象，不管你需不需要。
         （2） 如果现在有一种方法能够让类装载的时候不去初始化对象，那不就解决问题了？一种可行的方式就是采用类级内部类，在这个类级内部类里面去创建对象实例。这样一来，只要不使用到这个类级内部类， 那就不会创建对象实例，从而同步实现延迟加载和线程安全。

         3.补充说明下他是如何体现 懒加载的（Lazy initialization）：

         （1）因为内部静态类是要在有引用了以后才会装载到内存的。所以在你第一次调用getInstance()之前，SingletonHolder是没有被装载进来的，只有在你第一次调用了getInstance()之后，里面涉及到了return SingletonHolder.instance; 产生了对SingletonHolder的引用，内部静态类的实例才会真正装载。这也就是懒加载的意思

         关于 JVM来保证线程的安全性 这句话的意思：
         利用了classloader的机制来保证初始化instance时只有一个线程，所以也是线程安全的，同时没有性能损耗*/

    }

    private Demo8IInnerClassInstance() {
    }

    public static final Demo8IInnerClassInstance getInstance() {
        return LazyPig.INSTANCE;
    }

    public static void main(String[] args) {
        /** 1 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，
         * 这个类的加载过程是线程互斥的。这样当我们第一次调用getInstance的时候，
         * JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，
         * 这样我们就不用担心上面的问题。
         * 同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。
         * 这样我们暂时总结一个完美的单例模式：
         *
         * 2 单例模式实现方式有好多种，但大部分都会有多线程环境下的问题；使用静态内部类可以避免这个问题，
         * 因为在多线程环境下，jvm对一个类的初始化会做限制，同一时间只会允许一个线程去初始化一个类，
         * 这样就从虚拟机层面避免了大部分单例实现的问题，
         * 第一次加载Demo8IInnerClassInstance类的时候并不会实例化LazyPig对象，
         * 而是在调用getInstance（）方法时候才会加载LazyPig这个类，
         * 然后实例化LazyPig对象，延迟加载，减少内存消耗；
         */
        Demo8IInnerClassInstance instance = Demo8IInnerClassInstance.getInstance();
        Demo8IInnerClassInstance instance02 = Demo8IInnerClassInstance.getInstance();
        System.out.println(instance);
        System.out.println(instance02);

    }
}
