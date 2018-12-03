package top.sea521.day01;

public class TypeTranfer {
    public static final byte a = 100;
    public static final byte b = 100;
    static byte c;


    public static void main(String[] args) {
        //demo1();


        // TODO Auto-generated method stub

    }

    private static void demo1() {
        c = a + 9;
        c = (byte) (c + 1);
        int d = a + b;
        System.out.println(c);
        System.out.println(d);
    }

}
