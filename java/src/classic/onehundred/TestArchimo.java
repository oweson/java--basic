package classic.onehundred;

import lombok.val;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/25 0025 12:15
 */
public class TestArchimo {

    public static void main(String[] args) {

        int a = 100;
        String s = "";
        if (s != null) {

        }
        try {
            a = 100;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("ppx is comming");
        }
        for (int i = a; i > 0; i--) {
            System.out.println(i);

        }
        for (int i = 0; i < a; i++) {
            System.out.println(i);

        }
    }
}
