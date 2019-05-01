package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/12 0012 13:52
 */
public class Animal {
    int weight = 100;
    int a=100;
    protected int height = 172;
    public static final String look = "beautiful";

    public static final void future() {
        System.out.println("A look future!!!");
    }

    void look() {
        System.out.println("A   look");
    }

    protected void say() {
        System.out.println("A say");

    }

    public void eat() {
        System.out.println("A eat");
    }
}
