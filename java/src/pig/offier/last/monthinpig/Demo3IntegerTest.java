package pig.offier.last.monthinpig;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/12/8 18:20
 */
public class Demo3IntegerTest {
    public synchronized void methodA(int a, int b) {
    };

    public synchronized void methodB(int a){
        methodA(a, 0);
        System.out.println("hello");
    }
    public static void main(String[] args) {
        new Demo3IntegerTest().methodB(100);
        Integer integer = Integer.valueOf(100);
        // 装箱
        int intValue = integer.intValue();
        // 拆箱
    }
}
