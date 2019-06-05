package top.sea521.design.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 17:24
 */
public class CrayonFactory {
    private static Map<String, ICrayon> data = new HashMap<>();

    public static ICrayon getCrayon(String color) {
        // 多态！接口引用指向实现类的对象！
        if (data.containsKey(color)) {
            return data.get(color);
        }
        ICrayon crayon = new Crayon(color);
        data.put(color, crayon);
        return crayon;
    }
}
