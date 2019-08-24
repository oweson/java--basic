package basic.lake.collection.demo02.Set;

import java.util.HashSet;

/**
    Set集合不允许存储重复元素的原理
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {
        // 1 创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("BBB");
        set.add("CCC");
        set.add("abc");
        System.out.println(set);
        //[重地, 通话, abc]
        //todo 什么原理hash不允许重复？？？
    }

}
