package eclipse.mar.thread;

/**
 * @Author:oweson
 * @Date :2018/5/27 0027 21:40
 * @色厉而胆薄，好谋而寡断
 */
public class Thread01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是一只猪！");
            }
        }).start();
    }
}
