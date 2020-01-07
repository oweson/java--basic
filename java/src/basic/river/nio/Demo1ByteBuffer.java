package basic.river.nio;

import java.nio.ByteBuffer;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/19 0019 23:15
 */
public class Demo1ByteBuffer {
    public static void main(String[] args) {
        ByteBuffer allocate = ByteBuffer.allocate(2100);
        System.out.println(allocate.position());
        System.out.println(allocate.limit());
        System.out.println(allocate.capacity());
        String h = "asasasasa";
        /*存放数据用Put方法*/
        ByteBuffer put = allocate.put(h.getBytes());
        System.out.println(put.get(1) + "-----------------------------------");
        /*切换读取方式*/
        allocate.flip();
        /*利用get读取数据*/
        byte[] b = new byte[allocate.limit()];
        /*注意大小写，基本类型和包装类型的区别*/
        /*督导数据放入字节数组中*/
        allocate.get(b);
        System.out.println(new String(b, 0, b.length));
        System.out.println(b + "------------------------");
        /**可重复读，指针复原*/
        allocate.rewind();
        /*清空缓冲区
        但是缓冲区的数据还在，数据处于被遗忘状态*/
        allocate.clear();
        /*marh标记
        reset回顾到Mark标记状态*/
        ByteBuffer bb = ByteBuffer.allocate(100000);
        String ppx = "hello,world";
        ByteBuffer put1 = bb.put(ppx.getBytes());
        bb.flip();
        byte[] v = new byte[bb.limit()];
        bb.get(v, 0, 2);
        System.out.println(new String(v, 0, 2) + "-------------------");
        System.out.println(bb.position());
        bb.mark();
        bb.get(v, 2, 6);
        System.out.println(new String(v, 2, 6) + "===============================");
        /**回复标志*/
        // bb.rewind();
        bb.reset();
        System.out.println(bb.position());
/**判断缓冲区是否还有数据，剩余多少*/
        if (bb.hasRemaining()) {
            System.out.println("剩余" + bb.remaining());
        }


    }
}
