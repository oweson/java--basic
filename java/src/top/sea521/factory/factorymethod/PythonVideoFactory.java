package top.sea521.factory.factorymethod;

/**
 * Created by geely
 */
public class PythonVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
