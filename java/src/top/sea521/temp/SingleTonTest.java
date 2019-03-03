package top.sea521.temp;



/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/1 0001 19:44
 */
public class SingleTonTest {
    private SingleTonTest(){}
    private volatile static SingleTonTest singleton=null;
    public static SingleTonTest getSingleTonTest(){
        if(singleton==null){
            synchronized (SingleTonTest.class){
                if(singleton==null){
                    singleton=new SingleTonTest();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        SingleTonTest singleTonTest = SingleTonTest.getSingleTonTest();
        SingleTonTest singleTonTest02 = SingleTonTest.getSingleTonTest();
        System.out.println(singleTonTest==singleTonTest02);
    }
}
