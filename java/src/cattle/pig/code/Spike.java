package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/5 0005 17:51
 */
public class Spike {
    /**
     * 1、先要注意，count是静态变量，被所有对象共享
     * 2、接着要明白count++与++count的区别，前者是先赋值后相加，后者是先相加后赋值
     * 3、第一次a.increment()里的count是先赋值后相加，所以会先返回0，接着后相加，此时静态变量count为1。
     * 4、第二次a.anotherIncrement()里的count是先相加后赋值，所以相加后count为2，接着返回2，此时静态变量count为2。
     * 5、第三次a.increment()里的count是先赋值后相加，所以会先返回2，接着后相加，此时静态变量count为3。
     * 所以答案选C。
     */
    public static void main(String[] args) {
        Counter a = new Counter();
        System.out.println(a.increment());
        /**0*/
        System.out.println(a.anotherIncrement());
        /**1应该为2！！*/
        Counter b = new Counter();
        System.out.println(b.increment());
        /**2 */
    }
}

class Counter {
    private static int count = 0;

    public int increment() {
        return count++;
        /**返回0然后变成1*/
    }

    public int anotherIncrement() {
        /**1++为2返回*/
        return ++count;
    }
}
