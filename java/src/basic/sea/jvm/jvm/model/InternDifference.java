package basic.sea.jvm.jvm.model;

public class InternDifference {
    public static void main(String[] args) {
        String s = new String("a");
        String s2 = "a";
        System.out.println(s == s2);
        // false

        String s3 = new String("a") + new String("a");
        String s4 = "aa";
        System.out.println(s3 == s4);
        // true
    }
}
