package basic.collections;

import java.util.Random;
import java.util.TreeSet;

public class LuckyDoubleBall {
    private static int count = 0;

    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        String[] poll = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31", "32", "33", "34"};
        while (true) {

            setSth(poll);
            Thread.sleep(2100);
        }

    }

    private static void setSth(String[] poll) {
        Random r = new Random();
        TreeSet<String> ts = new TreeSet<String>();
        while (true) {
            /**
             * 得到随机的索引；*/
            int nextInt = r.nextInt(poll.length);
            ts.add(poll[nextInt]);
            if (ts.size() == 6) {
                break;
            }
        }
        TreeSet<Integer> blueBall = new TreeSet();
        for (int i = 0; i < 200; i++) {
            // bug有可能生成两次一样的；
            int blue = r.nextInt(16) + 1;
            blueBall.add(blue);
            if (blueBall.size() == 2) {
                break;
            }


        }
        count++;
        System.out.println("双色球第:" + count + "次" + "开奖" + ts.toString() + "蓝色"
                + blueBall.toString());

    }
}
