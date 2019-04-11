package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/29 0029 15:02
 */
public class StaticTest01 {
    /**
     * 1 静态块：用static申明，JVM加载类时执行，仅执行一次
     * 构造块：类中直接用{}定义，每一次创建对象时执行
     * 执行顺序优先级：静态块>main()>构造块>构造方法
     * !!!静态块按照申明顺序执行，所以先执行publicstaticB t1 = newB();该语句创建对象，
     * 则又会调用构造块，输出构造块
     * 接着执行public static B t1 = new B();输出构造块
     * 再执行
     * static
     * {
     * System.out.println("静态块");
     * }输出静态块
     * 最后main方法执行，创建对象，输出构造块。
     */
    public static StaticTest01 t1 = new StaticTest01();
    public static StaticTest01 t2 = new StaticTest01();

    {
        System.out.println("构造块");
    }

    static {
        System.out.println("静态块");
    }

    public static void main(String[] args) {
        /**构造块
         构造块
         静态块
         构造块*/
        StaticTest01 t = new StaticTest01();
    }
}
