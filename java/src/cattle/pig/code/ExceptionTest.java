package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/22 0022 11:36
 */
public class ExceptionTest {
    public static void main(String[] args) {
        args=new String[100];
        System.out.println(args[0]);
        /**finally一定会在return之前执行，
         * 但是如果finally使用了return或者throw语句，
         * 将会使trycatch中的return或者throw失效*/
        System.out.print(getNumber(0));
        System.out.print(getNumber(1));
        System.out.print(getNumber(2));
        System.out.print(getNumber(4));
        //-1
    }

    public static int getNumber(int num) {
        try {
            int result = 2 / num;
            return result;
        } catch (Exception exception) {
            return 0;
        } finally {
            if (num == 0) {
                return -1;
            }
            if (num == 1) {
                return 1;
            }
        }
    }
}
