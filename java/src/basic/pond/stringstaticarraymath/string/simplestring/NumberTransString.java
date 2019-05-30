package basic.pond.stringstaticarraymath.string.simplestring;

public class NumberTransString {
    public static void demo1() {
        String s = "  he llo ............... world";
        /** trime()只能去掉s首尾两端的空格;*/

        String trim = s.trim();
        System.out.println(trim.length());
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == ' ') {
                continue;
            }
            buffer.append(a);
        }
        System.out.println(buffer.length());
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println();
        NumberTransString.demo1();
        String s = "he l l o .....   world   ";

        /*
         * char c='c'; int codePoint = Character.toCodePoint(c, (char) 10);
         * System.out.println(codePoint);
         */
        /*
         * System.out.println(Byte.MAX_VALUE);
         * System.out.println(Integer.MAX_VALUE);
         * System.out.println(Long.MAX_VALUE);
         * System.out.println(Float.MAX_EXPONENT);
         * System.out.println(Double.MAX_VALUE);
         * System.out.println(".........."); Scanner sc = new
         * Scanner(System.in); String nextLine = sc.nextLine();
         * System.out.println(); if((!nextLine.isEmpty())){
         * System.out.println(Integer.parseInt(nextLine, 10)); } else{
         * System.out.println("no correct........"); } String s ="210";
         *
         * int parseInt = Integer.parseInt(s,10); int sum=parseInt;
         * System.out.println(Integer.toHexString(sum));
         * System.out.println((sum+100));
         * System.out.println(Integer.parseInt(s));
         */


    }

}
