package com.heima.bianliang;

public class XiaoFinal {
    final int a = 10;

    static void demo1(int c) {
        try {
            c = 100;
        } catch (Exception e) {
            e.printStackTrace();
        }
        final int aa = 100;
        System.out.println(c);
    }

    public static void main(String[] args) {
        demo1(100);
        final int b;
        System.out.println();
        b = 210;

    }

}
