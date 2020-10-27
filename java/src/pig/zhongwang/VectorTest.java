package pig.zhongwang;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author oweson
 * @date 2020/10/20 17:50
 */


public class VectorTest {
    public static void main(String[] args) {
        Vector<Integer> objects = new Vector<>();
        for (int i = 0; i < 10; i++) {
            objects.add(i);
        }

        for (Integer object : objects) {
            //objects.add(21);
            // Exception in thread "main" java.util.ConcurrentModificationException
        }
      /*  Iterator<Integer> iterator = objects.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
            objects.add(21);
            // Exception in thread "main" java.util.ConcurrentModificationException
        }*/
    }
}
