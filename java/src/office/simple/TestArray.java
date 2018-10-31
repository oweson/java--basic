package office.simple;

import java.util.UUID;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/4 0004 16:57
 */
public class TestArray {
    static int[] a = {1, 2, 3};

    public static void main(String[] args) {
        String s = UUID.randomUUID().toString().toUpperCase();
        System.out.println(s);
        System.out.println(a[0]);
        /**BB930E0840CD*/
        a[0] = 100;
        a[1] = a[0];
        for (int a :
                a
                ) {
            System.out.println(a);

        }
    }
}
