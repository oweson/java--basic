package top.sea521.design.structural.Flyweight.v1;

import java.util.HashMap;
import java.util.Map;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 17:24
 */
public class CrayonFactory {
    /**
     * 这里是核心！！！
     */
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
