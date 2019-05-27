package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/3 0003 10:49
 */
public class OneSb {
    private OneSb(){}
    private volatile static OneSb oneSb=null;
    public static final OneSb getOneSb(){
        if(oneSb==null){
            synchronized (OneSb.class){
                if(oneSb==null){
                    oneSb=new OneSb();
                }
            }
        }
        return oneSb;
    }

    public static void main(String[] args) {
        OneSb oneSb = OneSb.getOneSb();
        OneSb oneSb02 = OneSb.getOneSb();
        System.out.println(oneSb==oneSb02);
    }
}
