package pig.offier.last.monthinpig;

import java.util.Vector;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/12/8 13:27
 */
public class Demo2GenericTest {

    public static void main(String[] args) {
        Vector<? extends Number> vector = new Vector<Integer>(1024);
        Integer a=100;
        Exception exception = new RuntimeException();



    }
}
