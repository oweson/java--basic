package top.sea521.design.factory;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/26 0026 19:58
 */
public class TestMainVideo {
    /**
     * 1 抽象工厂；由子类的具体实现
     */
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.open();
        VideoFactory videoFactory02=new PythonVideoFactory();
        Video python = videoFactory02.getVideo();
        python.open();


    }
}
