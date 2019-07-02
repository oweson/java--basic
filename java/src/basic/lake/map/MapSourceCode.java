package basic.lake.map;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/7/2 21:27
 */
public class MapSourceCode {
    public static void main(String[] args) {
        /** 1 hashmap  数组+链表+红黑树实现的，数组查找快，链表增删快！
         *  2 红黑树：*/
        Map hashmap = new HashMap<>(100,100f);
        // HashMap<K, V> extends AbstractMap<K, V> implements Map<K, V>, Cloneable, Serializable
        // abstract class AbstractMap<K, V> implements Map<K, V>
        Map linkedHashMam = new LinkedHashMap();
        // LinkedHashMap<K, V> extends HashMap<K, V> implements Map<K, V>

        Map hashtable = new Hashtable();
        // Hashtable<K, V> extends Dictionary<K, V> implements Map<K, V>, Cloneable, Serializable
        Map properties = new Properties();
        // Properties extends Hashtable<Object, Object>

        Map treemap = new TreeMap();
        //  TreeMap<K, V> extends AbstractMap<K, V> implements NavigableMap<K, V>, Cloneable, Serializable
        // interface NavigableMap<K, V> extends SortedMap<K, V>
        // interface SortedMap<K, V> extends Map<K, V>
        Map concurrentHashMap = new ConcurrentHashMap();
        // class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable
        // interface ConcurrentMap<K, V> extends Map<K, V>


    }
}
