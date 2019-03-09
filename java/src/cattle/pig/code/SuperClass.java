package cattle.pig.code;

import cattle.pig.article.SuperTest;

import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/22 0022 11:30
 */
public class SuperClass extends Date {
    /**
     * 1 TestSuper和Date的getClass都没有重写，他们都是调用Object的getClass，
     * 而Object的getClass作用是返回的是运行时的类的名字。
     * 这个运行时的类就是当前类，所以
     * super.getClass().getName()
     * 返回的是test.SuperTest，与Date类无关
     * 要返回Date类的名字需要写super.getClass().getSuperclass()
     */
    private static final long serialVersionUID = 1L;

    private void test() {
        System.out.println(super.getClass().getName());
        System.out.println("调用父类......" + super.getClass().getSuperclass().getName());
    }

    public static void main(String[] args) {
        new SuperClass().test();
    }
}
