package eclipse.mar.system;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/27 0027 17:06
 */
public class getProperty {
    public static void main(String[] args) {
        String property = System.getProperty("os.name");
        System.out.println(property);
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        System.out.println(userHome);

        System.out.println(userHome);
        String version = System.getProperty("java.version");
        String javaHome = System.getProperty("java.home");
        System.out.println(version);
        System.out.println(javaHome);
    }
}
