package top.sea521.design.factory;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 14:24
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
