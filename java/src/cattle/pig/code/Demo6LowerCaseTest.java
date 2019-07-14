package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/29 0029 19:47
 */
public class Demo6LowerCaseTest {
    public static boolean isAdmin(String userId) {
        //新的对象和常量池的对象比较；
        return userId.toLowerCase() == "admin";
        //false
    }

    public static void main(String[] args) {
        System.out.println(isAdmin("Admin"));
    }
}
