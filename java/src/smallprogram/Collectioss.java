package smallprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月10日 下午6:58:28
 * 类说明：侵权必究。。。。。。。
 */

public class Collectioss {
    class CollectionMethod {

        //Arrays.asList()方法接受一个数组或一个用逗号分隔的元素列表，并将其转换为一个List对象
        public void testAsList() {
            System.out.println("*****Arrays.asList()*****");
            Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
            System.out.println(collection);
        }

        //Collection.addAll()方法运行起来快得多，而且构建一个不包含元素的Collection,然后调用Colletions.addAll()很方便，是首选方式
        public void testCollectionAddAll() {
            System.out.println("*****Collection.addAll()*****");
            Collection<Integer> collection = new ArrayList<Integer>();
            Integer[] moreInts = {6, 7, 8, 9, 10};
            collection.addAll(Arrays.asList(moreInts));
            System.out.println(collection);
        }

        //Collections.addAll()方法接受一个Collection对象，以及一个数组或一个用逗号分割的列表
        public void testCollectionsAddAll() {
            System.out.println("*****Collections.addAll()*****");
            Collection<Integer> collection = new ArrayList<Integer>();
            Collections.addAll(collection, 11, 12, 13, 14, 15);
            System.out.println(collection);

        }

        //迭代器用于遍历集合，使用Iterator iterator()方法获取
        //Iterator提供了统一的遍历集合元素的方式，主要有boolean hasNext()判断集合是否还有元素可遍历,E next()返回迭代的下一个元素
        public void testHasNextAndNext() {
            Collection<String> collection = new HashSet<String>();
            String[] strs = {"java", "cpp", "php", "c#"};
            collection.addAll(Arrays.asList(strs));
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                String s = it.next();
                System.out.print(s + ",");
            }
            System.out.println();
        }

        //在使用迭代器遍历集合时，不能通过remove()方法删除集合元素，否则会抛出并发异常
        //在调用remove()方法前必须通过迭代器的next()方法迭代过元素，删除的就是该元素，并且不能再次调用remove()方法，除非再次调用next()后
        public void testRemove() {
            Collection<String> collection = new HashSet<String>();
            String[] str = {"java", "cpp", "php", "c#"};
            collection.addAll(Arrays.asList(str));
            Iterator<String> it = collection.iterator();
            while (it.hasNext()) {
                String s = it.next();
                if (s.indexOf('c') != -1) {
                    it.remove();
                }
            }
            System.out.println(collection);
        }
    }

}
