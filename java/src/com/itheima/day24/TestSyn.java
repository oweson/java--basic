package com.itheima.day24;

import java.util.Date;

/**
 * @Author:oweson
 * @Date :2018/5/27 0027 22:08
 * @色厉而胆薄，好谋而寡断
 */
public class TestSyn {
    Date date=new Date();
    public  void  testSth(){
        synchronized (date){
            //那啥是任意的对象，但是匿名的对象史奴可以的；
            System.out.println(10);
        }

    }

    public static void main(String[] args) {
         new TestSyn().testSth();
    }
}
