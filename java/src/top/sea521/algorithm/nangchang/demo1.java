package top.sea521.algorithm.nangchang;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/23 0023 23:38
 */
public class demo1 {
    public int num = 0;

    public void fun() {
        System.out.println("---A---");
    }
}

class B extends demo1 {
    public int num = 1;
    @Override
    public void fun() {
        System.out.println("---B---");
    }

    public static void main(String[] args) {
        demo1 demo1 = new B();
        System.out.println(((B) demo1).num);
        // 1 子类优先，又叫做覆盖！
        demo1.fun();
        // B  先在本地找，然后向上查找；


    }
}
