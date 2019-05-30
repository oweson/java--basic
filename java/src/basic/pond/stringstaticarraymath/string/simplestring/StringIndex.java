package basic.pond.stringstaticarraymath.string.simplestring;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/18 0018 10:47
 */
public class StringIndex {
    public static void main(String[] args) {
        String s = "login.jsp,he.jsp";
        int i = s.indexOf("login.jsp");
        /**查找在字符串的下标，大于等于0就是找到了*/
        System.out.println(i);
        // 0;
    }

}
