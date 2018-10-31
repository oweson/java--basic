package top.sun521.code.pragram;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/10 0010 7:23
 */
public class SingleTon01 {
    private SingleTon01(){}
    /**单列的*/
    private static SingleTon01 singleTon = new SingleTon01();
    public static SingleTon01 getInstance(){
        return singleTon;
    }
}
