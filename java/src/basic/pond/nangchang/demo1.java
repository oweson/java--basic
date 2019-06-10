package basic.pond.nangchang;


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

    public void fun02() {
        System.out.println("fun02......................................");
    }
}

class SonOfDemo1 extends demo1 {
    public int num = 1;

    @Override
    public void fun() {
        System.out.println("---SonOfDemo1---");
    }

    public static void main(String[] args) {
        demo1 demo1 = new SonOfDemo1();
        System.out.println(((SonOfDemo1) demo1).num);
        // 1 子类优先，又叫做覆盖！
        // SonOfDemo1  先在本地找，然后向上查找；
        demo1.fun();
        // 2 子类没有重写，向上找！
        demo1.fun02();


    }
}
