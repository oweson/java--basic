package com.itheima.day24;

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
                System.out.println("pppppappaaaaaaaaaaaaaaaaaaa");
            }
        }){}.start();;
       new Thread(){
           @Override
           public void run() {
               for (int i = 0; i < 100; i++) {
                   System.out.println(100);

               }
           }
       }.start();
    }
}
