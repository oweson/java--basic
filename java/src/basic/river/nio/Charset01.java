package basic.river.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/26 0026 20:57
 */
public class Charset01 {
    public static void main(String[] args) throws CharacterCodingException {
        Charset gbk = Charset.forName("GBK");
        /*得到编码器*/
        CharsetEncoder charsetEncoder = gbk.newEncoder();
        /*得到解码器*/
        CharsetDecoder charsetDecoder = gbk.newDecoder();
        CharBuffer allocate = CharBuffer.allocate(1020);
        CharBuffer put = allocate.put("我爱你，但是你在哪里呢？");
        allocate.flip();
        /*切换读的操作*/
        /*编码*/
        ByteBuffer encode = charsetEncoder.encode(allocate);
        for (int i = 0; i < 9; i++) {
            System.out.println(encode.get());

        }
        encode.flip();
        Charset charset = Charset.defaultCharset();

//        CharBuffer decodes = charsetDecoder.decode(encode);
//        System.out.println(decodes.toString());

    }
}
