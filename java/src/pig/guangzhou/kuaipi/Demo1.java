package pig.guangzhou.kuaipi;


import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/12 0012 22:56
 */
public class Demo1 {
    public static final void demo1() {
        for (int i = 0; i < 4; i += 2) {
            System.out.println(i + "");

        }

        //System.out.println(i);编译失败，i的范围在for里面！！！
    }

    public static final void demo2() {
        String a = "ab";
        final String bb = "b";
        String b = bb + "a";
        // 引用不可变，可以运算；
        System.out.println(a == b);
    }

    public static final void demo3() {
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        for (Integer integer : list) {
            if (integer == 5) {
                list.remove(5);
            }
            // xception in thread "main" java.util.ConcurrentModificationException
            System.out.println(integer);

        }

    }

    public static void main(String[] args) {
        demo3();
        demo1();
        demo2();

    }
}

interface a {
    // 1 接口可以default;不可以保护；

}

abstract class b {
    // 2 抽象类不可以保护修饰符；

}

