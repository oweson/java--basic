package top.sea521.design.creational.singleton;

/**
 * @author chengwanli
 * @date 2020/10/16 11:40
 */


public class ManyDog {
    private volatile static ManyDog singleDog = null;



    public static ManyDog getInstance() {
        return new ManyDog();
    }}
