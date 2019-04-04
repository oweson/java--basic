package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/4 0004 23:32
 */
public class LazyTest01 {
    private LazyTest01() {
    }

    private static LazyTest01 lazyTest01 = new LazyTest01();

    public static final LazyTest01 getLazyTest01() {
        return lazyTest01;
    }

    public static void main(String[] args) {
        LazyTest01 lazyTest01 = getLazyTest01();
        LazyTest01 lazyTest02 = getLazyTest01();
        System.out.println(lazyTest01 == lazyTest02);

    }

}
