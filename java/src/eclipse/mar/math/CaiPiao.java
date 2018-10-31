package eclipse.mar.math;

import java.util.Random;
import java.util.Scanner;

public class CaiPiao {
    public static void demo1() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        Scanner s = new Scanner(System.in);
        System.out.println("please input a number");
        int nextInt = s.nextInt();
        for (int i = 0; i < nextInt; i++) {
            int number = r.nextInt((int) Math.pow(10, 7));
            String luck = "" + number;
            while (luck.length() < 7) {
                luck = luck + "0";
            }
            sb.append(luck);

        }
        System.out.println(sb.toString());
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        demo1();

        // TODO Auto-generated method stub

    }

}
