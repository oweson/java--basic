package top.sea521.factory.factory;

import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/26 0026 19:55
 */


public class JavaVideo extends Video {
    Date date  = new Date();
    @Override
    public void open() {
        System.out.println("java video");
    }
}
