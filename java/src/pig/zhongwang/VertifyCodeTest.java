package pig.zhongwang;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author oweson
 * @date 2020/10/20 23:06
 */


public class VertifyCodeTest {
    public static List<String> chinese() {
        List<String> stringList = new ArrayList<>();
        stringList.add("你");
        stringList.add("好");
        stringList.add("吃");
        stringList.add("饭");
        stringList.add("了");
        stringList.add("吗");
        stringList.add("?");
        return stringList;

    }

    public static void main(String[] args) {
        List<String> chinese = chinese();
        int size = chinese.size();
        Random random = new Random();
        for (int j = 0; j < 10; j++) {
            String vertifyCode = "";
            for (int i = 0; i < 6; i++) {
                int nextInt = random.nextInt(size);
                vertifyCode += chinese.get(nextInt);
            }
            System.out.println(vertifyCode);
        }


    }
}
