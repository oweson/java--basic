package eclipse.mar.testjihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月17日 下午8:42:22 类说明：侵权必究。。。。。。。
 */

public class Testmap {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("a", "oweson");
        map.put("b", "ppx");
        Set<Entry<String, Object>> entrySet = map.entrySet();
        Iterator<Entry<String, Object>> iterator = entrySet.iterator();

        map.forEach(null);
        System.out.println(map);
    }
}
