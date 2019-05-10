package eclipse.mar.easyfalse;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/10 0010 10:51
 */
public class BreakAndContinueTest {
    public static void breakTest() {
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);


        }
    }

    public static void continueTest() {
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                continue;
            }
            System.out.println(i);


        }
    }

    public static void main(String[] args) {
        breakTest();
        continueTest();

    }
}
