package github.design.factory.adapter;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/10 0010 16:38
 */
public class PlayMp4 implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("noythong........................");
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("mp4 name is " + fileName);

    }
}
