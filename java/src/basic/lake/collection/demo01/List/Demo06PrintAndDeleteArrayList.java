package basic.lake.collection.demo01.List;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/24 0024 12:16
 */
public class Demo06PrintAndDeleteArrayList {
    private static void foreachLover() {
        List<Students> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(new Students(21));
        }
        // 1 用增强for循环；
        for (Students s : list) {
            System.out.println(s);
        }

        // 2 循环遍历
        for (int i = 0; i < list.size(); i++) {
            Students s = list.get(i);
            System.out.println(s);

        }
    }

    private static void dangerDeleteNumberInList() {
        /**删除用迭代，列表的大小和小标是变化的随着删除；
         * 在这个方法中有一个严重的错误。当一个元素被删除时，
         * 列表的大小缩小并且下标变化，
         * 所以当你想要在一个循环中用下标删除多个元素的时候，它并不会正常的生效。*/
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
        System.out.println(list);


    }

    private static void arrayToList(int[] arr) {
        List list = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);

        }
        System.out.println(list + "!");
    }

    private static void ReplaceList() {
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

    public static void main(String[] args) {
        // 1 修改集合元素
        ReplaceList();
        // 2 数组转集合
        int[] arr = {1, 2, 3, 5, 7, 100};
        arrayToList(arr);
        /** 3 集合转数组*/
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.println(object);

        }
        // 4 集合的内部类
        List<String> list1 = Arrays.asList("a", "b");
        // 数组的内部类
        //list1.add("21");ava.lang.UnsupportedOperationException
        //  list1.remove(1);java.lang.UnsupportedOperationException
        System.out.println(list1);
        // 5 不安全的集合删除
        dangerDeleteNumberInList();
        // 6 对象数组的遍历
    }
}
