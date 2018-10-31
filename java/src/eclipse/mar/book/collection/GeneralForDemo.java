package eclipse.mar.book.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class GeneralForDemo {
    public static void demo1() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            a.add(i);

        }
        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        demo1();

        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            a.add(i);

        }
        // 添加完毕；
        for (int i = 1; i < a.size(); i += 2) {
            System.out.print(a.get(i) + " ");

        }
        // TODO Auto-generated method stub

    }

}
