package pig.huyu;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/4 0004 19:19
 */
public class Demo2IntegerTest {

    public static void main(String[] args) {
        Integer i = new Integer(0);
        integerTest(i);
        System.out.println(i);

    }

    private static void integerTest(Integer i) {
        int intValue = i.intValue();
        intValue += 100;
        i = new Integer(intValue);
        System.out.println(i);

    }
}
