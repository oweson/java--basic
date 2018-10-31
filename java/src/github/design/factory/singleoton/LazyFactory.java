package github.design.factory.singleoton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/20 0020 14:17
 */
public class LazyFactory {
    /**
     * 防止外部实例化
     */
    private LazyFactory() {
    }

    private static LazyFactory instance = null;

    public static synchronized LazyFactory getOneInstance() {
        if (instance != null) {
            return instance;
        }
        return new LazyFactory();
    }
}
