package idea.sea.interface01;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/24 0024 20:58
 */
public interface Fish extends Animal {
    //
    @Override
    default void eating() {

    }

    @Override
    void look();
}
