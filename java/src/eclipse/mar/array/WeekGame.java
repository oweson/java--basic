package eclipse.mar.array;

import java.util.Scanner;

//import com.sun.java_cup.internal.runtime.Scanner;

public class WeekGame {

    /**
     * @param args
     */
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
