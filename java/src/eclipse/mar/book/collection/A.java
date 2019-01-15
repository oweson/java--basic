package eclipse.mar.book.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class A {
    static int count = 0;

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        String[] poll = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31", "32", "33", "34"};
        while (true) {

            SetSth(poll);
            Thread.sleep(2100);
        }

    }

    public static void SetSth(String[] poll) {
        Random r = new Random();
        TreeSet<String> ts = new TreeSet<String>();
        while (true) {
            int nextInt = r.nextInt(poll.length);
            ts.add(poll[nextInt]);
            if (ts.size() == 6) {
                break;
            }
        }
        TreeSet<String> blueBall = new TreeSet();
        //boolean add = blueBall.add(r.nextInt(16));
        count++;
        //int[] array = (int[]) ts.toArray();
        Object[] array = ts.toArray();
        //Object[] tss=Arrays.sort(array);
        System.out.println("双色球第:" + count + "次" + "开奖" + ts.toString() + "蓝色"
                + blueBall.toString());

    }
}
