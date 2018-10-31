package github.design.factory.adapter;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/10 0010 16:54
 */
public class Test {
    public static void main(String[] args) {
        AudioAdapter audioAdapter = new AudioAdapter();
        audioAdapter.play("sasa", "sdsds");
        audioAdapter.play("mp3", "一个人");
        audioAdapter.play("vlc", "明天你好");
        audioAdapter.play("mp4", "海天空");

    }
}
