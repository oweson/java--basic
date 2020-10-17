package top.sea521.design.creational.singleton;

/**
 * @author chengwanli
 * @date 2020/10/16 11:53
 */

/**在这个例子中内部类 SingletonPatterHolder 的静态变量 singletonPattern，这个变量是我们需要的那个单例，即外部类 SingletonPattern 的对象，就是那个我们需要的唯一的对象。

 当我们调用 SingletonPattern.getInstance() 时，内部类 SingletonPatternHolder 才会初始化，静态变量 singletonPattern 被创建出来。

 这个实现思路中最主要的一点就是利用类中静态变量的唯一性。
 这种方式的优点是：
 1. 不用 synchronized ，节省时间（虽然synchronized 浪费那个时间根本不算什么时间。唉！时间就是生命，听说不用synchronized 会快100倍，哈哈！）；
 2. 调用 getInstance() 的时候才会创建对象，不调用不创建，节省空间，这有点像传说中的懒汉式。

 刚开始我还有点疑惑，内部类 SingletonPatternHolder 是静态的，那么外部类 SingletonPattern 加载的时候，内部类 SingletonPatternHolder 会被加载，后来想起来，静态内部类与外部类没有什么大的关系，外部类加载的时候，内部类不会被加载，静态内部类只是调用的时候用了外部类的名字而已。*/
public class SingletonPattern {
    private SingletonPattern() {
    }

    private static class SingletonPatternHolder {
        private static final SingletonPattern singletonPattern = new SingletonPattern();
    }

    public static SingletonPattern getInstance() {
        return SingletonPatternHolder.singletonPattern;
    }

    public static void main(String[] args) {
        System.out.println(SingletonPattern.getInstance());
        System.out.println(SingletonPattern.getInstance());


    }
}
