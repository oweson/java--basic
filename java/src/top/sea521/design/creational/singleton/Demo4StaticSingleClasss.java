package top.sea521.design.creational.singleton;

public class Demo4StaticSingleClasss {
    public static Demo4StaticSingleClasss HELLO = new Demo4StaticSingleClasss();

    private Demo4StaticSingleClasss() {
    }

    public static Demo4StaticSingleClasss getsInstance() {
        return Demo4StaticSingleClasss.HELLO;
    }

}
