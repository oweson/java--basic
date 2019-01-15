package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 11:44
 */
public class GBKTOUTF_8 {
    /** 1 下面哪段程序能够正确的实现了GBK编码字节流到UTF-8编码字节流的转换：
     1
     byte[] src,dst;

     正确答案: B   你的答案: B
     dst=String.frombytes(src,”GBK”).getbytes(“UTF-8”)
     dst=new String (src,”GBK”).getbytes(“UTF-8”)
     dst=new String (”GBK”, src,) getbytes()
     dst=String.encode(String.decode(src,”GBK”)), “UTF-8”)*/
}
