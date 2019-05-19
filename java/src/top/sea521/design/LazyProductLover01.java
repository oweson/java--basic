package top.sea521.design;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/17 0017 11:22
 */
public class LazyProductLover01 {
    private volatile static LazyProductLover01 lover01;
    /**双重校验*/
    public static LazyProductLover01 getLover01(){
        if(lover01==null){
            synchronized (LazyProductLover01.class){
                if(lover01==null){
                    lover01=new LazyProductLover01();
                }
            }

        }
        return lover01;
    }
}
