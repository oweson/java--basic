package basic.river.nio;

import java.nio.ByteBuffer;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/22 0022 20:37
 */
public class Demo3DirectBuffer {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1000000);
        System.out.println(byteBuffer.isDirect());

    }
}
