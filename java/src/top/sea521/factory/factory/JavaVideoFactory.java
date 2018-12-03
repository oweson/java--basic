package top.sea521.factory.factory;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 14:23
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
