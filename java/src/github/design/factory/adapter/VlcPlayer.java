package github.design.factory.adapter;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/10 0010 16:36
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playng lcdname" + fileName);

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("啥也不做。。。。。。。。。。");

    }
}
