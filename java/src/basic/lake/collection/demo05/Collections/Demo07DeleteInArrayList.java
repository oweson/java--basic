package basic.lake.collection.demo05.Collections;

import basic.lake.collection.demo05.Collections.Bird;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo07DeleteInArrayList {

    public static void main(String[] args) {
        int count = 0;
        List<Bird> list = new ArrayList<Bird>();
        for (int i = 0; i <= 100; i++) {
            //  1 添加100bird,名字是hero+数字，100终止！
            count++;
            list.add(new Bird("hero" + i));
        }
        //  2 创建临时容器，并截串，转换为int;
        List<Bird> tem = new ArrayList<>();
        for (Bird b : list) {
            String s = b.name.substring(4);
            int i = Integer.parseInt(s);
            if (0 == i % 8) {
                // 3 是8的倍数就放入临时的容器，然后删除！
                tem.add(b);
            }

        }
        for (Bird c : tem) {
            // 遍历临时的容器，原始的容器删除部分！
            list.remove(c);

        }
        // 打印紅色的信息；
        System.err.println(list.size());

        /*for (Bird bird : list) {
            // 不能再foreach直接删除！
            list.remove(bird);

        }*/
        Iterator<Bird> birdIterator = list.iterator();
        while (birdIterator.hasNext()) {
            // 不断的指向下一个！
            birdIterator.next();
            //list.remove(bird);不允许；，在迭代器中遍历集合想要删除元素时不能使用集合的remove方法进行删除，
            // 而应该使用迭代器本身的remove方法进行操作，这样就不会报错了。
            birdIterator.remove();
        }
        System.out.println("集合的数据有：" + list.size());
        // 清除所有；
        list.clear();


    }

}
