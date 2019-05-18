package eclipse.mar.nio;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/23 0023 20:56
 */
public class ReadAndWriteFileInMemory {


    public static void main(String[] args) throws IOException {
        /**通道数据传输u*/

        FileChannel open001 = FileChannel.open(Paths.get("E:\\办公软件中心\\素材中心\\aa.jpg"), StandardOpenOption.READ);
        FileChannel out002 = FileChannel.open(Paths.get("E:\\办公软件中心\\素材中心\\bbb.jpg"),StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);
        open001.transferTo(0,open001.size(),out002);
        open001.close();
        out002.close();
        System.out.println("==================================================");
        FileChannel open = FileChannel.open(Paths.get("E:\\办公软件中心\\素材中心\\aa.jpg"), StandardOpenOption.READ);
        FileChannel out = FileChannel.open(Paths.get("E:\\办公软件中心\\素材中心\\bb.jpg"),StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);
        /**内存映射文件*/
        MappedByteBuffer map = open.map(FileChannel.MapMode.READ_ONLY, 0, open.size());
        MappedByteBuffer map1 = out.map(FileChannel.MapMode.READ_WRITE, 0, out.size());
        /**直接对缓冲区进行数据的读写*/
        byte[] b = new byte[map.limit()];
        map.get(b);
        /**把读到的数据写入map1，也就是写入区*/
        map1.put(b);
        open.close();
        out.close();


    }
}
