package eclipse.mar.collections;

import java.util.HashSet;
import java.util.Random;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/27 0027 10:28
 */
public class TestDistinct02 {
    public static void main(String[] args) {
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
}
