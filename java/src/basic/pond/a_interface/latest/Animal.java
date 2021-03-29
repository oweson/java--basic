package basic.pond.a_interface.latest;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/24 0024 20:56
 */
public interface Animal {

    default void eating() {
        System.out.println("eating");
    }

    static void sleeping() {
        System.out.println("sleep");
    }

    void look();
}
