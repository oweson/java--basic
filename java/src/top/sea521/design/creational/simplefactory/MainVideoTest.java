package top.sea521.design.creational.simplefactory;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/26 0026 19:58
 */
public class MainVideoTest {
    /**
     * 1 简单工厂模式:又叫静态工厂方法模式！
     */
    public static void main(String[] args) {
        Video videoJava = VideoFactory.getVideo(JavaVideo.class);
        Video videoPython = VideoFactory.getVideo(PythonVideo.class);
        videoJava.open();
        videoPython.open();
        //第一抽象比第二种好；扩展好，符合开闭原则
        System.out.println("=================================================");
        Video java = VideoFactory.generator("java");
        if (java == null) {
            return;
        }
        java.open();
        Video go = VideoFactory.generator("go");
        if (go == null) {
            return;
        }
        go.open();

    }
}
