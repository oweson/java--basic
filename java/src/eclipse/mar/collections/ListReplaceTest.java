package eclipse.mar.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 10:19
 */
public class ListReplaceTest {
    public static void main(String[] args) {
        //1.创建List集合对象
        List<String> list = new ArrayList<>();
        //2.存入数据
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("二丫");
        list.add("钱六");
        list.add("孙七");
        for (int i = 0; i < list.size(); i++) {
        if ("二丫".equalsIgnoreCase(list.get(i))) {
        list.set(i, "王二丫");
        }

        }
        System.out.println(list);
        }
        }
