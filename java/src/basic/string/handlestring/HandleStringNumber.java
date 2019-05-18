package basic.string.handlestring;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/18 0018 17:44
 */
public class HandleStringNumber {
    public static void main(String[] args) {
        String a = "123.123";
        System.out.println(a.substring(0, a.indexOf(".")));
        // 截串！

        String str = "23.23456789";
        System.out.println("原数字字符串:" + str);

        HandleAble s1 = new HandleAble() {
            @Override
            public String handleString(String str) {
                return str.substring(0, str.indexOf("."));
            }
        };
        String string = s1.handleString(str);

        System.out.println("取整后:" + string);

        int num = 4;

        HandleAble s2 = new HandleAble() {
            // TODO
            @Override
            public String handleString(String str) {

                int i = str.indexOf(".") + num + 1;
                char c = str.charAt(i);
                //System.out.println(c);

                if (c <= '4') {
                    return str.substring(0, i).toString();
                } else {
                    char c1 = (char) (str.charAt(str.indexOf(".") + num) + 1);
                    return str.substring(0, i - 1) + c1;

                }
            }
        };
        String sss = s2.handleString(str);
        System.out.println("保留" + num + "位小数后:" + sss);

    }
}
