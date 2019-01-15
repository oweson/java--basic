package top.mooc.playdataStructure.second.array.Link;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/10 0010 11:39
 */
public class LinkedList<E> {
    private class Node {
        //元素
        public E e;
        //引用
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
            /**this后面没有点操作符！！！*/
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

}
