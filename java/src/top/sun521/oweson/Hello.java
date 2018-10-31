package top.sun521.oweson;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:oweson
 * @Date :2018/5/22 0022 7:21
 * @色厉而胆薄，好谋而寡断
 */
public class Hello extends  Thrad01 implements Animal {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);
        list.add(21);

        list.add(21);
                for (Object o :list) {
                    System.out.println(o);

        }


    }

    @Override
    public int say() {
        return 0;
    }

    @Override
    public void speak() {
        System.out.println();
        String hello = new String("hello");
        System.out.println(hello);
        System.out.println();

    }
}
