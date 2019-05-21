package basic.lake.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/17 0017 20:39
 */
public class DistinctTest {
    private static void GeneratorNumber() {
        HashSet<Integer> set = new HashSet<Integer>();
        Random r = new Random();
        while (true){
            int i = r.nextInt(100) + 1;
            set.add(i);
            if(set.size()==10){
                break;
            }

        }
        System.out.println("保证得到10个不一样的元素！");
        System.out.println(set);
    }
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
