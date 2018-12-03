package top.sea521.factory.simplefactory;


import java.util.Calendar;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/26 0026 19:58
 */
public class TestMainVideo {
    public static void main(String[] args) {
        Calendar c;
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
        ;
    }
}
