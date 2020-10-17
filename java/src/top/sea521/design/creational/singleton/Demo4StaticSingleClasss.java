package top.sea521.design.creational.singleton;

/**
 * ①静态内部类是你第一调用的时候才实例化
 * ②而直接静态代码块，是加载就实例化了
 * ③相比之下节省了内存
 */
public class Demo4StaticSingleClasss {
    public static Demo4StaticSingleClasss HELLO = new Demo4StaticSingleClasss();

    private Demo4StaticSingleClasss() {
        System.out.println(1);
    }

     static Demo4StaticSingleClasss getsInstance() {
        return Demo4StaticSingleClasss.HELLO;
    }

    public static void main(String[] args) {
        System.out.println(getsInstance());
        System.out.println(getsInstance());
    }

}
