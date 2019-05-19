package basic.pond.array;

import java.util.Scanner;


public class WeekGame {


    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int count = 0;
            count++;
            if (count == 2) {
                break;
            }
            System.out.println("please input some number 1-7");
            int a = sc.nextInt();
            if (a == 2) {
                System.out.println("hahahhahah");
                break;
            }
            System.out.println("today is" + week(a));
        }

    }

    private static char week(int a) {
        char[] abc = {'一', '二'};
        return abc[a];
    }

}
