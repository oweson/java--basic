package eclipse.mar.easyfalse;

import java.util.HashMap;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/23 0023 23:08
 */
public class ForceMapTest {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("a",1);
        map.put("b",1);
        map.put("c",1);
        map.put("d",1);
        boolean a = map.containsKey("a");
        boolean b = map.containsValue("b");
        int d = (int) map.get("d");
        Object d02 = map.get("d");
        // 没有声明泛型，取出的是object需要强制转换；int 接受是不行的；


    }
}
