package basic.basic.other;

public class JiuJiu {
    public static void demo1() {
        for (int a = 9; a > 0; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print(a + "*" + b + "=" + a * b + "   ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        JiuJiu.demo1();

    }

}
