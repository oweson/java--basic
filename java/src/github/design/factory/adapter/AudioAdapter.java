package github.design.factory.adapter;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/10 0010 16:48
 */
public class AudioAdapter implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        MediaPlayer mediaPlayer;
        /**提供MP3音乐格式的支持*/
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("mp3" + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") ||
                audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);


        } else {
            System.out.println("no format");
        }
    }
}
