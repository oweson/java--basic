package top.sun521.oweson;

/**
 * @Author:oweson
 * @Date :2018/5/22 0022 7:14
 * @色厉而胆薄，好谋而寡断
 */
public class Thrad01 extends  Thread{
    public static void main(String[] args) {
        new Thrad01().start();
        System.out.println();
        System.out.println();
        System.out.println();
        int a=0;
        int b=100;


    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100; i++) {
            System.out.println("hello,morning");

        }
    }
}
