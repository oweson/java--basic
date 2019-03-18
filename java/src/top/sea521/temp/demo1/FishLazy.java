package top.sea521.temp.demo1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/11 0011 16:23
 */
public class FishLazy {
    private static volatile FishLazy fishLazy;
    private FishLazy(){}
    public static FishLazy getFishLazy(){
        if(fishLazy==null){
            synchronized (FishLazy.class){
                if(fishLazy==null){
                    fishLazy=new FishLazy();
                }
            }
        }
        return fishLazy;
    }

    public static void main(String[] args) {
        FishLazy fishLazy = getFishLazy();
        FishLazy fishLazy02 = getFishLazy();
        System.out.println(fishLazy);
        System.out.println(fishLazy02);
    }
}
