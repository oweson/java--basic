package basic.basic.samplestaticmodel;


public class GuessNumber {
    public static void main(String[] args) {
        int max = 100;
        int min = 1;
        int count = 0;
        int number = (int) ((Math.random() * 100) + 1);
        while (true) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            int guess = sc.nextInt();
            System.out.println("please input" + min + "-----" + max);
            count++;
            if (guess > number) {
                max = guess;
                System.out.println("you are big+min" + "------" + max);
            } else if (guess < number) {
                min = guess;
                System.out.println("you are small" + min + "-----" + max);
            } else {
                System.out.println("you are right " + "number is" + number + "you use " + count);
                System.out.println("are you play");

                sc = new java.util.Scanner(System.in);
                String s = sc.nextLine();
                if (s.equals("y")) {
                    number = (int) (Math.random() * 100);
                    min = 1;
                    max = 100;
                    count = 0;
                } else {
                    throw new RuntimeException(

                    );
                }

            }
        }

    }

}
