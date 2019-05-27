package top.sea521.design.singleton;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 18:26
 */
public class Demo8IInnerClassInstance {
    private static class LazyPig {
        public static final Demo8IInnerClassInstance INSTANCE = new Demo8IInnerClassInstance();

    }

    private Demo8IInnerClassInstance() {
    }

    public static final Demo8IInnerClassInstance getInstance() {
        return LazyPig.INSTANCE;
    }

    public static void main(String[] args) {
        Demo8IInnerClassInstance instance = Demo8IInnerClassInstance.getInstance();
        Demo8IInnerClassInstance instance02 = Demo8IInnerClassInstance.getInstance();
        System.out.println(instance);
        System.out.println(instance02);

    }
}
