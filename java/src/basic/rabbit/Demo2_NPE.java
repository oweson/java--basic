package basic.rabbit;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2020/2/29 15:06
 */
public class Demo2_NPE {
    public static void main(String[] args) {
        // Initializing String variable with null value
        String ptr = null;
        // Checking if ptr.equals null or works fine.
        try {
            // This line of code throws NullPointerException
            // because ptr is null
            if (ptr.equals("gfg")) {
                System.out.print("Same");
            } else {
                System.out.print("Not Same");
            }
        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught");
        }
    }
}
