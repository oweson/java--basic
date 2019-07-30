package basic.river.file;

import java.io.File;

public class Demo1OfCreateFile {

    public static void main(String[] args) {
        File f = new File("c:\\windows");
        System.out.println(f.getParent());
        File[] fs = f.listFiles();
        if (null == fs)
            return;
        long minSize = Integer.MAX_VALUE;
        long maxSize = 0;
        File minFile = null;
        File maxFile = null;
        for (File file : fs) {
            if (file.isDirectory())
                continue;
            if (file.length() > maxSize) {
                maxSize = file.length();
                maxFile = file;
            }
            if (file.length() != 0 && file.length() < minSize) {
                minSize = file.length();
                minFile = file;
            }
        }
        System.out.printf("最大的文件是%s，其大小是%,d字节%n", maxFile.getAbsoluteFile(), maxFile.length());
        System.out.printf("最小的文件是%s，其大小是%,d字节%n", minFile.getAbsoluteFile(), minFile.length());

        File file = new File("haha.txt");
        File[] listRoots = file.listRoots();
        for (int i = 0; i < listRoots.length; i++) {
            //File file = listRoots[i];
            System.out.println(listRoots[i]);
        }
		/*System.out.println(file.isFile());
		System.out.println(file.exists());
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.lastModified());
		Long time=file.lastModified();
		Date date  =new Date(time);
		//System.out.println(file.setLastModified(date);
		//System.out.println(file.setLastModified(new Date(0)));
		File file2 = new File("E:/ppa.txt");
		System.out.println(file2.getAbsolutePath());
		File file3 = new File(file, "tio.txt");
		System.err.println(file3.getAbsolutePath());*/

    }

}
