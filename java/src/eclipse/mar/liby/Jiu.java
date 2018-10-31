package eclipse.mar.liby;

public class Jiu {
    public static void demo1() {
        for (int a = 9; a > 0; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print(a + "*" + b + "=" + a * b + "   ");
            }
            System.out.println("\n");
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Jiu.demo1();
        // TODO Auto-generated method stub

    }

}
