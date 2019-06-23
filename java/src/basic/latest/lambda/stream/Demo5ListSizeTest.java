package basic.latest.lambda.stream;

import java.util.Arrays;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/12 0012 14:21
 */
public class Demo5ListSizeTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list.size());
        System.out.println(list.contains("ppx"));

    }
}
