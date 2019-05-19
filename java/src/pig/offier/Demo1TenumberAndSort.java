package pig.offier;

import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/10 0010 22:06
 */
public class Demo1TenumberAndSort {
    public static void main(String[] args) {
        Random random = new Random();
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(1000));

        }
        Collections.sort(list);
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
