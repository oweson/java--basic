package top.sea521.design.simplefactory;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/26 0026 19:58
 */
public class MainVideoTest {
    // 1 简单工厂模式:又叫静态工厂方法模式！
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        Video video02 = videoFactory.getVideo(PythonVideo.class);
        video.open();
        video02.open();
        /** 1 第一抽象比第二种好；扩展好，符合开闭原则*/
        System.out.println("=================================================");
        Video java = VideoFactory.generator("java");
        if (java == null) {
            return;
        }
        java.open();

    }
}
