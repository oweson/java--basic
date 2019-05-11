package eclipse.mar.innerclass;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/12 0012 1:07
 */
public interface Bird extends Animal, AnimalSpecial {
    // 重写
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
