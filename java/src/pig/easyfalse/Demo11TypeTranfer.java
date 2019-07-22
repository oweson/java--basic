package pig.easyfalse;

public class Demo11TypeTranfer {
    public static final byte A = 100;
    public static final byte B = 100;
    static byte c;
    public static final int D=100;


    public static void main(String[] args) {
        /**声明为final不可以重新赋值，可以计算的将值赋值给其他的；*/
        int x=D+100;
        demo1();

    }

    private static void demo1() {
        c = A + 9;
        c = (byte) (c + 1);
        int d = A + B;
        System.out.println(c);
        System.out.println(d);
    }

}
