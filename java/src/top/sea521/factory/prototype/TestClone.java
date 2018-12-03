package top.sea521.factory.prototype;

import java.nio.channels.Pipe;
import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 20:37
 */
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**不是一个对象，默认是浅的克隆*/
        Date date = new Date(0L);
        ClonePig clonePig = new ClonePig("ppx",date);
        ClonePig clone = (ClonePig) clonePig.clone();
        System.out.println(clonePig);
        System.out.println(clone);
        clonePig.getDate().setTime(6666777666666L);
        System.out.println(clonePig);
        System.out.println(clone);


    }
}
