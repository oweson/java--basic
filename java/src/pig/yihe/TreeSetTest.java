package pig.yihe;

import java.util.Map;
import java.util.TreeMap;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/21 0021 21:31
 */
public class TreeSetTest {
    public static void main(String[] args) {
        try {
            String[] s = {"01", "02", "03", "04"};
            Map map = new TreeMap<>();
            map.put(3, 3);
            map.put(3, 3);
            map.put(2, 2);
            map.put(4, 4);
            map.put(1, 1);
            for (Object a : map.keySet()) {
                System.out.print(a);

            }
            System.out.println(s[4]);
        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
