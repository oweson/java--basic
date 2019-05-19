package basic.pond.stringstaticarraymath.demo04;

import java.util.Arrays;

/**
 * 题目：
 * 请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印。
 */
public class Demo02ArraysPractise {
    public static final int MyDemo1() {
        String s = "askjkajskasj001";
        char[] chars = s.toCharArray();
        System.out.println("升序");
        Arrays.sort(chars);
        System.out.println(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            //System.out.print(i + " ");这里打印的是下标
            System.out.print(chars[i] + " ");

        }
        return 0;
    }

    public static void main(String[] args) {
        MyDemo1();
        String str = "asv76agfqwdfvasdfvjh";

        // 如何进行升序排列：sort
        // 必须是一个数组，才能用Arrays.sort方法
        // String --> 数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        // 第一：对字符数组进行升序排列
        // 第二：需要倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }

}
