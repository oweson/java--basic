package eclipse.mar.book;

import java.util.Scanner;

public class a {
    // public class SumOfHundred {
    public static void demo(int i) {
        int sum = 0;
        for (int a = 1; a <= i; a++) {
            sum += a;
        }
        System.out.println(sum);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("no play please input sb hahhahahahh");
            System.out.println("please input...........");
            String line = s.nextLine();
            if (line.equalsIgnoreCase("sb")) {
                System.out.println("game over..............");
                break;
            }
            int cc = Integer.parseInt(line);
            demo(cc);

        }

        // TODO Auto-generated method stub
        // TODO Auto-generated method stub
        // System.out.println(10000);

    }

}
