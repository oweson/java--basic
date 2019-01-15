package pig.huyu;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/4 0004 19:46
 */
public class Demo5ExceptionTest {
    /**
     * 解析：1.执行foo(0)时，不满足try语句块中的if语句，所以不会抛出异常，
     * 执行finally语句
     * 2.执行foo(1)时，满足try中的If语句，抛出异常，在catch中进行异常处理，
     * 虽然有return语句，但是finally中的内容必须执行，
     * 也就是说要先执行了finally才进行return操作，return后
     * output += “4”将不会再执行.
     */
    public static String output = "";

    public static void foo(int i) throws Exception {
        try {
            if (i == 1) {
                /**发生异常捕捉到了进入catch*/
                throw new Exception();
            }
            output += "1";
        } catch (Exception e) {
            /**捕捉到啦准备返回看看是否有finally*/
            output += "2";
            return;
        } finally {
            output += "3";
        }
        /**外面的作用域不异常会运行！！！*/
        output += "4";

    }

    public static void main(String[] args) throws Exception {
        foo(0);
        //123
        foo(1);
        //23
        System.out.println(output);
        //13423
    }
}
