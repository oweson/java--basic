package pig.unknow;

import java.util.Arrays;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/6 0006 22:48
 */
public class ArrayAsListTest {
    public static void demo1(List<Number> list) {
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        //demo1(list); 报错误，内部类对象，是只读的


    }
}
