package basic.scannerandarraylistrandom.demo05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/1 0001 19:09
 */
public class SmallTest {
    public static final void demo1(){
        Random random = new Random();
        List<Integer> list = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            int nextInt = random.nextInt(100);
            list.add(nextInt);

        }
        List<Integer> small = new ArrayList<>(10);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                small.add(list.get(i));

            }

        }
        for (Integer integer : small) {
            System.out.println("偶数是："+integer);

        }
    }
    public static void main(String[] args) {
        demo1();
        /** 题目：
         用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合当中。
         要求使用自定义的方法来实现筛选。*/
    }
}
