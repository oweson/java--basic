package basic.river.file;

import java.io.*;

public class Demo2WriteByteToFile {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {
        // 写入文件
         demo1();
        File file = new File("D://lol.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte b[] = new byte[(int) file.length()];
        fileInputStream.read(b);
        for (byte a : b) {
            System.out.println(a);
        }


    }

    private static void demo1() throws FileNotFoundException, IOException {
        File file = new File("D://lol.txt");
        FileOutputStream outputStream = new FileOutputStream(file);
        byte dates[] = {1, 2, 3, 4, 5, 6, 7};
        outputStream.write(dates);
        outputStream.close();
    }

}
