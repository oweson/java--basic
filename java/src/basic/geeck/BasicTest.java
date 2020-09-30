package basic.geeck;

/**
 * @author chengwanli
 * @date 2020/9/22 22:17
 */


public class BasicTest {
    public static void main(String[] args) {
        int i = 0, j = 0;
        j = i++ + ++i;
        System.out.println(j);

        int a = 0;
        int b = a++ + 1;
        System.out.println("b = " + b);
    }
}
