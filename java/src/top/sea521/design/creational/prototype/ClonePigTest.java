package top.sea521.design.creational.prototype;

import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 20:37
 */
public class ClonePigTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        /**不是一个对象，默认是浅的克隆；
         * 深的克隆原先的改变不会改变其他的对象；不同的引用指向不同的对象！！！*/
        Date date = new Date(0L);
        ClonePig clonePigOrigin = new ClonePig("ppx", date,"henan");
        ClonePig clonePigLatest = (ClonePig) clonePigOrigin.clone();
        System.out.println(clonePigOrigin);
        System.out.println(clonePigLatest);
        clonePigOrigin.getDate().setTime(6666777666666L);
        System.out.println("--------------------------------------------------------------");
        System.out.println(clonePigOrigin);
        System.out.println(clonePigLatest);


    }
}
