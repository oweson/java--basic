package top.sun521.code.pragram;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/10 0010 7:19
 */
public class SingleTon {
    public static void main(String[] args) {
        System.out.println(getInstance());
        System.out.println(getInstance());
    }
    private static SingleTon singleTon=null;
    public static   synchronized  SingleTon  getInstance(){
        if(singleTon==null){
            return new SingleTon();
        }
        return singleTon;
    }
}
