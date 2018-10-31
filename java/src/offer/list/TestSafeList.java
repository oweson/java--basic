package offer.list;

import antlr.collections.impl.Vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/11 0011 22:01
 */
public class TestSafeList {
    public static void main(String[] args) {
        /**同步的集合*/
        Vector vector = new Vector();
        vector.appendElement(21);
        vector.appendElement("12");
        int capacity = vector.capacity();
        System.out.println("vector的容量是:" + capacity);
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            System.out.println(elements.nextElement());
        }
        /**创建安全的集合同步集合*/
        List list = Collections.synchronizedList(new LinkedList<Integer>());
        list.add(21);
        list.add("asas");
        System.out.println(list);
    }
}
