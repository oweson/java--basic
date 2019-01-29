package eclipse.mar.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/17 0017 20:39
 */
public class TestDistinct {
    public static final void demo1() {
        List list = new ArrayList();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(11);
        System.out.println(list);

        HashSet set = new HashSet();
        List newList = new ArrayList();
        /**添加全部*/
        set.addAll(list);
        newList.addAll(set);
        System.out.println(newList);
    }

    public static void main(String[] args) {
        /** 1 去除重复,利用set去除重复元素的原理！*/
        demo1();
        /** 2 如果对象排序，对象需要重新equals()和hashcode()*/


    }
}
