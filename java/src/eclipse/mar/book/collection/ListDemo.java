package eclipse.mar.book.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ListDemo {

    /**
     * @param args
     * @throws InterruptedException
     */
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws InterruptedException {
        List list = new ArrayList();
        list.add(1);
        list.add("hello");
        list.add('p');
        System.out.println(list.toString());
        System.out.println(list.size());

        list.removeAll(list);
        System.out.println(list.size());
        Random r = new Random();
        Set s = new HashSet<Integer>();
        int count = 0;
        while (true) {
            for (int i = 1; i <= 7; i++) {
                int nextInt2 = r.nextInt(16);
                s.add(nextInt2);

            }
            System.out.println(s.size());
            if (s.size() <= 7) {
                s.add(r.nextInt(16));

                System.out.println(list.size());
            } else {
                count++;
                System.out.println("双色球第" + count + "次开奖" + s.toString());
                s.removeAll(s);
                Thread.sleep(2222);
            }
        }

        // TODO Auto-generated method stub

    }

}
