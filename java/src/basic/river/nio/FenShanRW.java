package basic.river.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/24 0024 22:52
 */
public class FenShanRW {
    public FenShanRW() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        /**获得通道*/
        RandomAccessFile randomAccessFile = new RandomAccessFile("E:\\aa.txt", "rw");
        FileChannel channel = randomAccessFile.getChannel();
        /**分配指定大小的缓冲区*/
        ByteBuffer allocate = ByteBuffer.allocate(100);
        System.out.println("-----------------------------");
        /**分散读取*/
        ByteBuffer allocate1 = ByteBuffer.allocate(1024);
        ByteBuffer[] b = {allocate, allocate1};
        channel.read(b);
        for (ByteBuffer byteBuffer : b) {
            byteBuffer.flip();
            /**切换读取模式*/
        }
        System.out.println(new String(b[0].array(), 0, b[0].limit()));
        System.out.println("=================================");
        System.out.println(new String(b[1].array(), 0, b[1].limit()));

        /**聚集写入*/
        RandomAccessFile randomAccessFile02 = new RandomAccessFile("e:\\bb.txt", "rw");
/**朱茵引用的名字，工具自动生成的引用名字是类似的，随意使用的时候请注意
 * 否则会有错误；*/
        FileChannel channel1 = randomAccessFile02.getChannel();
        channel1.write(b);

    }


}
