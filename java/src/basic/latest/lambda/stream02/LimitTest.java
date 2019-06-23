package basic.latest.lambda.stream02;

import java.util.ArrayList;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 11:11
 */
public class LimitTest {
    /**
     * 取用前几个：limit、跳过前几个：skip
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("陈玄风");
        list.add("梅超风");
        list.add("陆乘风");
        list.add("曲灵风");
        list.add("武眠风");
        list.add("冯默风");
        list.add("罗玉风");

        list.stream().limit(2).forEach(System.out::println);
        System.out.println("==================================================");
        list.stream().skip(list.size() - 2).forEach(System.out::println);
        System.out.println("==============================================");
        //取出后两个
        list.stream().sorted().forEach(System.out::println);
    }
}
