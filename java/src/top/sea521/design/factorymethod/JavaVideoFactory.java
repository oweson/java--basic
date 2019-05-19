package top.sea521.design.factorymethod;

/**
 * Created by geely
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
