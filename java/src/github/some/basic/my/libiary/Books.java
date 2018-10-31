package github.some.basic.my.libiary;

public class Books {

    public static final String[] BOOKS = {"ssm", "js", "css", "html", "java"};

    public static int seleteBookByNumber(String book) {
        for (int i = 0; i < BOOKS.length; i++) {
            if (book.equalsIgnoreCase(BOOKS[i])) {
                System.out.println(book);
                return (++i);
            }
        }
        return -1;
    }

    public static String selectBookByName(int num) {
        if (num > 0 && num < BOOKS.length) {
            return BOOKS[num - 1];
        } else {
            return "0";
        }
    }

    public static void main(String[] args) {
        String selectBookByName = selectBookByName(1);
        System.out.println(selectBookByName);
        int seleteBookByNumber = seleteBookByNumber("css");
        System.err.println(seleteBookByNumber);

    }
}
