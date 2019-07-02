package top.sea521.design.singleton;
/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 19:45
 */

/**
 * * 懒汉模式 -》 双重同步锁单例模式
 * * 单例实例在第一次使用时进行创建
 */
public class Demo3LazyDoubleCheckSingleton {
    // 1、memory = allocate() 分配对象的内存空间
    // 2、ctorInstance() 初始化对象
    // 3、instance = memory 设置instance指向刚分配的内存

    // 1 单例对象 volatile + 双重检测机制 -> 禁止指令重排
    private volatile static Demo3LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    // 2 私有构造函数
    private Demo3LazyDoubleCheckSingleton() {
        if (lazyDoubleCheckSingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }

    }

    public static Demo3LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            /**
             * 3 不加锁可能new两次！
             */
            synchronized (Demo3LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new Demo3LazyDoubleCheckSingleton();
                    //1.分配内存给这个对象
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    //2.初始化对象
                    //intra-thread semantics
                    //3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }

    public static void main(String[] args) {
        /**
         * 2  public static Singleton getInstance() {
         * 8         if (instance == null) {
         * 9             synchronized (Singleton.class) {
         * 10                 if (instance == null) {
         * 11                     instance = new Singleton();
         * 12                 }
         * 13             }
         * 14         }
         * 15
         * 16         return instance;
         * 17     }
         * 18 }
         * 复制代码
         * 就算在单例类被实例化时有多个线程同时通过了第8行代码 if (instance == null) 的判断，
         * 但同一时间只有一个线程获得锁后进入临界区。通过第8行判断的每个线程会依次获得锁进入临界区，
         * 所以进入临界区后还要再判断一次单例类是否已被其它线程实例化，
         * 以避免多次实例化。由于双重加锁实现仅在实例化单例类时需要加锁，所以相较于第2种实现方式会带来性能上的提升。另外需要注意的是双重加锁要对 instance 域加上 volatile 修饰符。由于 synchronized 并不是对 instance 实例进行加锁（因为现在还并没有实例），所以线程在执行完第11行修改 instance 的值后，应该将修改后的 instance 立即写入主存（main memory），而不是暂时存在寄存器或者高速缓冲区（caches）中，以保证新的值对其它线程可见。
         * <p>
         * 补充：第9行可以锁住任何一个对象，要进入临界区必须获得这个对象的锁。
         * 由于并不知道其它对象的锁的用途，所以这里最好的方式是对 Singleton.class 进行加锁。
         */
        /**反射的面前一切都是赤裸裸的；
         *     public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
         *         Class objectClass = LazySingleton.class;
         *        Constructor c = objectClass.getDeclaredConstructor();
         *        c.setAccessible(true);
         *
         *        LazySingleton o1 = LazySingleton.getInstance();
         *
         *         Field flag = o1.getClass().getDeclaredField("flag");
         *        flag.setAccessible(true);
         *         flag.set(o1,true);
         *
         *
         *         LazySingleton o2 = (LazySingleton) c.newInstance();
         *
         *        System.out.println(o1);
         *         System.out.println(o2);
         *        System.out.println(o1==o2);
         *     }*/
        System.out.println(Demo3LazyDoubleCheckSingleton.getInstance());
        System.out.println(Demo3LazyDoubleCheckSingleton.getInstance());
    }
}
