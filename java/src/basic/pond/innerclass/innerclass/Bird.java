package basic.pond.innerclass.innerclass;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/12 0012 1:07
 */
public interface Bird extends Animal, Animal02 {
    /**
     * 重写
     */
    @Override
    void eat();

    @Override
    void play();

    @Override
    default void run() {
        System.out.println("run");

    }

    @Override
    default void sleep() {
        System.out.println("sleep");

    }
}
