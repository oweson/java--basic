package basic.pond.basic.other;

import java.util.Random;

public class GeneratotChar {
    public static char returnChar() {
        Random random = new Random();
        String string = "hello,world";
        return string.charAt(random.nextInt(string.length()));
    }

    private static char randomChar() {
        Random r = new Random();
        String s = "ABCDEFGHJKLMNPRSTUVWXYZ0123456789";
        return s.charAt(r.nextInt(s.length()));
    }

    public static void main(String[] args) {
        System.out.println(returnChar());
        // System.err.println(randomChar());
    }

}
