package basic.lake.collection.thinking.injava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static javafx.scene.input.KeyCode.T;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/18 21:15
 */
public class Demo1CollectionsTest {
    public static void main(String[] args) {
        List<Integer> source = new ArrayList<>();
        List<Integer> target = new ArrayList<>();

        Collections.indexOfSubList(source,target);
        // 1 返回target在source第一次出现的位置，没有-1；
        //Collections.replaceAll(List<T> t,source,target);
        Collections.reverse(source);
        // 2 反转
        Collections.shuffle(source);
        // 3 打乱顺序
        Collections.swap(source,1,2);
        // 4 交换元素

    }
}
