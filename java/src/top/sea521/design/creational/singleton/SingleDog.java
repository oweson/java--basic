package top.sea521.design.creational.singleton;

/**
 * @author chengwanli
 * @date 2020/10/16 11:32
 */


public class SingleDog {
    private volatile static SingleDog singleDog = null;

    private SingleDog() {
        if (singleDog != null) {
            throw new RuntimeException("单列构造器禁止调用");
        }
    }

    public static SingleDog getInstance() {
        if (singleDog == null) {
            synchronized (SingleDog.class) {
                if (singleDog == null) {
                    singleDog = new SingleDog();
                }
            }
        }
        return singleDog;
    }


}
