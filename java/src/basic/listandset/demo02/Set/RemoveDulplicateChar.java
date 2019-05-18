package basic.listandset.demo02.Set;

import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/5 0005 16:28
 */
public class RemoveDulplicateChar {
    public static final void removeRepeatedNumberInList() {
        /**
         *  需求:将集合中的重复元素去掉
         *
         *  分析:
         *  1,创建List集合存储若干个重复元素
         *  2,单独定义方法去除重复
         *  3,打印一下List集合
         */
        List<Integer> list = new ArrayList<>(100);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(100);
        demo(list);
        for (Integer integer : list) {
            System.out.println(integer);

        }

    }

    private static void demo(List<Integer> list) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>(100);
        linkedHashSet.addAll(list);
        list.clear();
        list.addAll(linkedHashSet);
        /*
         * 分析
         * 去除List集合中的重复元素
         * 1,创建一个LinkedHashSet集合
         * 2,将List集合中所有的元素添加到LinkedHashSet集合
         * 3,将list集合中的元素清除
         * 4,将LinkedHashSet集合中的元素添加回List集合中
         */
    }

    public static void main(String[] args) {
        removeRepeatedNumberInList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符...");
        Collection<Character> characters = new HashSet<>(100);
        String nextLine = scanner.nextLine();
        char[] toCharArray = nextLine.toCharArray();
        for (char c : toCharArray) {
            characters.add(c);

        }
        System.out.println("遍历结果");
        for (Character character : characters) {
            System.out.print(character + " ");

        }
    }
}
