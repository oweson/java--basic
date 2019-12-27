package basic.pond.a_basic_enhance.annotation.demo;


/**
 * 小明定义的计算器类
 */
public class Calculator {

    /**
     * 1 加法
     */
    @Check
    public void add() {
        String str = null;
        str.toString();
        System.out.println("1 + 0 =" + (1 + 0));
    }

    /**
     * 2 减法
     */
    @Check
    public void sub() {
        System.out.println("1 - 0 =" + (1 - 0));
    }

    /**
     * 3 乘法
     */
    @Check
    public void mul() {
        System.out.println("1 * 0 =" + (1 * 0));
    }

    /**
     * 4 除法
     */
    @Check
    public void div() {
        System.out.println("1 / 0 =" + (1 / 0));
    }


    public void show() {
        System.out.println("永无bug...");
    }

}
