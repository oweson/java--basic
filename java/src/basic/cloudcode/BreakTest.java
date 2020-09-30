package basic.cloudcode;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2017/8/22 19:58
 */
public class BreakTest {
    /**
     * continue和break有点类似，区别在于continue只是终止本次循环，接着还执行后面的循环，break则完全终止循环。
     * <p>
     * 可以理解为continue是跳过当次循环中剩下的语句，执行下一次循环。
     */
    public static final void demo1() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            total += i;

        }
        System.out.println(total);
    }

    public static final void demo2() {
        int total = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            total += i;

        }
        System.out.println(total);

    }

    public static void main(String[] args) {
        demo1();
        demo2();

    }
}
