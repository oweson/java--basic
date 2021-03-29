package basic.pond.a_interface.latest;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/24 0024 20:58
 */
public interface Fish extends Animal {
    @Override
    default void eating() {
    }
    @Override
    void look();
}
