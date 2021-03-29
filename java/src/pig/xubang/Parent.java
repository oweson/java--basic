package pig.xubang;

/**
 * @author oweson
 * @date 2021/3/29 21:20
 */


public class Parent {
    protected Integer i = 1;

    public Parent() {
        this(2);
    }

    public Parent(int i) {
        this.i = i;
    }

    public void printValue() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        new Son().printValue();
        // 2

    }
}
