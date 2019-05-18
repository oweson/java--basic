package basic.file;

import java.io.*;

public class Demo2WriteByteToFile {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        // demo1();
        File file = new File("e://lol.txt");

        FileInputStream fileInputStream = new FileInputStream(file);
        byte b[] = new byte[(int) file.length()];
        fileInputStream.read(b);
        for (byte a : b) {
            System.out.println(a);
        }

        // TODO Auto-generated method stub

    }

    private static void demo1() throws FileNotFoundException, IOException {
        File file = new File("e://lol.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        byte dates[] = {1, 2, 3, 4, 5, 6, 7};
        outputStream.write(dates);
        outputStream.close();
    }

}
