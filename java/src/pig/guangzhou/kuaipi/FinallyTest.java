package pig.guangzhou.kuaipi;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/12 0012 23:12
 */
public class FinallyTest {
    public static void main(String[] args) {
        int mabi = Mabi();
        System.out.println(mabi);
    }

    private static int Mabi() {
        int a=1;
        try {
            return a;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ++a;
            System.out.println("finally");
        }
        return 9;
    }
}
