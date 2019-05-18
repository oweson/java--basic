package basic.offier.practice.error;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/17 0017 10:51
 */
public class TestException {
    public static void main(String[] args) {
        String s = null;
        if (s != null && s.equalsIgnoreCase("")) {
            /**具有短路的效果，不存在bullpointecception*/

        }
        System.out.println("hahahhaha");
        if (s != null & s.equalsIgnoreCase("")) {
            /**不具有短路的效果，存在潜在的nullpointexception*/

        }
    }
}
