package github.some.basic.my.javas;

public class TestYinyongAndOther {
    static int a = 100;
    static String b = "hello";

    public static void name(int a) {
        a = 1000;
        System.out.println(a);

    }

    public static void ha(String name) {
        b = name;

    }

    public static void main(String[] args) {
        name(900);
        System.out.println(a);
        ha("dragon");
        System.out.println(b);
        // TODO Auto-generated method stub

    }

}
