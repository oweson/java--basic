package offer.list;

import java.util.LinkedList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/17 0017 7:31
 */
public class LinkedList01 {
    public static void main(String[] args) {
        /**大量的增加删除用linkedList会提高效率*/
        List<Integer> linkedList = new LinkedList();
        linkedList.add(21);
        linkedList.add(22);
        linkedList.remove(0);
        System.out.println(linkedList);

    }
}
