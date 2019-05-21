package basic.lake.collections;

import org.w3c.dom.ls.LSException;

import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/26 0026 15:49
 */
public class DeleteStrInList {
    public static void main(String[] args) {
        /** 1 筛选字符串。

         - 定义ArrayList集合，存入多个字符串。
         - 长度大于5的字符串，打印删除后的集合。
         */
        /**解决思路： 遍历原集合对象
         for(int i = 0;i<list.size();i++) {
         //获取当前元素
         String str = list.get(i);
         //如果str的长度大于等于5
         if(str.length()>5) {
         newList.add(str);//将str添加到新集合中
         }
         }
         //遍历新集合
         for(Object str : newList) {
         //因为新集合中的元素就是要删除的元素
         list.remove(str);
         }
         把复合的放到新的集合，删除新的集合的元素！*/
        List<String> list = new ArrayList<>(10);
        list.add("hello");
        list.add("hell");
        list.add("hel");
        list.add("h");
        list.add("hello,world");
        list.add("hello!");
        System.out.println("源字符串");
        System.out.println(list);
        Iterator<String> iterator = list.iterator();


        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.length() > 5) {
                iterator.remove();
            }
        }
        System.out.println("删除后的串");
        System.out.println(list);
    }
}
