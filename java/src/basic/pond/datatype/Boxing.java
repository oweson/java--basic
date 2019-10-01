package basic.pond.datatype;

/**
 * Created by Brian on 2016/4/14.
 * <p>
 * TODO 有些细节待理解
 * <p>
 * 主要是考装箱和拆箱
 */
public class Boxing {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        System.out.println(c == d);
        // true 自动装箱,缓存
        System.out.println(e == f);
        // false  自动装箱,未缓存
        System.out.println(c == (a + b));
        // true 数字和对象，自动的拆箱
        System.out.println(c.equals(a + b));
        // true 调用 equals(),比较的是值,而不是对象地址
        System.out.println(g == (a + b));
        // true todo???
        System.out.println(g.equals(a + b));
        // false
        System.out.println(new Integer(2) == new Integer(2));

        Long y = 100L;

        int z = 100;
        System.out.println(y == z);
        // true

    }
}

