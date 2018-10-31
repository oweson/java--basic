package github.design.factory.adapter;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/10 0010 16:39
 */
public class MediaAdapter implements MediaPlayer {
    /**
     * 这是一个适配器的类
     */
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        /**沟槽函数中完成对象的创创建*/
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new PlayMp4();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        }
        advancedMediaPlayer.playMp4(fileName);

    }
}
