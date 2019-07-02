package basic.lake.collection;

import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/7/2 21:38
 */
public class ListSourceCode {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        // extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
        Collection linkedList = new LinkedList();
        // extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
        Collection hashset = new HashSet();
        // AbstractSet<E> implements Set<E>, Cloneable, Serializable
        Collection linkedHashSet = new LinkedHashSet();
        // extends HashSet<E> implements Set<E>, Cloneable, Serializable
        Collection treeset = new TreeSet();
        // extends AbstractSet<E> implements NavigableSet<E>, Cloneable, Serializable


        /** 1 abstract class AbstractSet<E> extends AbstractCollection<E> implements Set<E> {
         protected AbstractSet() ;
         2 interface NavigableSet<E> extends SortedSet<E>
         3 SortedSet<E> extends Set<E>*/
    }
}
