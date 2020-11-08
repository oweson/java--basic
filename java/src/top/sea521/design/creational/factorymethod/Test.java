package top.sea521.design.creational.factorymethod;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
        Video factory2Video = videoFactory2.getVideo();
        factory2Video.produce();
        Video videoFactory3Video = videoFactory3.getVideo();
        videoFactory3Video.produce();

    }

}
