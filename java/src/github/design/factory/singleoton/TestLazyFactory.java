package github.design.factory.singleoton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/20 0020 14:21
 */
public class TestLazyFactory {
    public static void main(String[] args) {
        LazyFactory oneInstance = LazyFactory.getOneInstance();
        LazyFactory oneInstance1 = LazyFactory.getOneInstance();
        System.out.println(oneInstance);
        System.out.println(oneInstance1);
        System.out.println(oneInstance == oneInstance1);
    }
}
