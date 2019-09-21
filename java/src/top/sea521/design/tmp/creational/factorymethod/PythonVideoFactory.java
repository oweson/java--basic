package top.sea521.design.tmp.creational.factorymethod;

/**
 * Created by geely
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
