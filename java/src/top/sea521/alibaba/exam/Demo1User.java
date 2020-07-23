package top.sea521.alibaba.exam;

import java.util.Arrays;
import java.util.List;

public class Demo1User {
    public static void main(String[] args) {
        String[] str = new String[]{"1","2"};
        List<String> list = Arrays.asList(str);
        str[0]="100";
        System.out.println(list);
        // 也会随着修改！
    }
}
