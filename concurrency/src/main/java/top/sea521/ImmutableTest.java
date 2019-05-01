package top.sea521;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/28 0028 15:10
 */
public class ImmutableTest {
    public static final Integer a=100;
    public static final Map<Integer,Integer> map=new HashMap<>();
    static {
        map.put(1,2);
        map.put(2,3);

    }
    public static void main(String[] args) {
        map.put(1,100);
        System.out.println(map);
        /**变成不可修改的*/
        Collections.unmodifiableList(null);

    }
}
