package github.some.basic.my.format;

public class TestString {

    public static void main(String[] args) {

        //方法1
        //  demo11();
        short s = 'z';
        System.out.println(s);

        //方法2
        // demo2();

    }

    private static void demo2() {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs2[] = new char[5];
        for (int i = 0; i < cs2.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs2[i] = pool.charAt(index);
        }
        String result2 = new String(cs2);
        System.out.println(result2);
    }

    private static void demo11() {
        char cs[] = new char[5];
        short start = '0';
        System.out.println(start);
        short end = 'z' + 1;
        for (int i = 0; i < cs.length; i++) {

            char c = (char) ((Math.random() * (end - start)) + start);
            if (Character.isLetter(c) || Character.isDigit(c)) {
                cs[i] = c;
                break;

            }
        }
        String result = new String(cs);
        System.out.println(result);
    }
}
