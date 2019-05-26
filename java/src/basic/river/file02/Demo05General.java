package basic.river.file02;

import java.io.File;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 12:06
 */
public class Demo05General {
    /**
     * 操作步骤:
     * 1.在D盘aaa文件夹中创建一个b.txt文件并输入数据
     * 2.创建文件对象关联路径：d:/aaa/b.txt
     * 3.调用文件对象的相关方法获得信息并输出。可以通过API帮助文档查询方法。
     */

    public static void main(String[] args) {
        // 创建文件对象
        File f = new File("d:/aaa/b.txt");
        // 获得文件名
        String filename = f.getName();
        // 获得文件大小
        long filesize = f.length();
        // 获得文件的绝对路径
        String path = f.getAbsolutePath();
        // 获得父文件夹路径，返回字符串
        String parentPath = f.getParent();
        // 获得父文件夹路径，返回文件对象
        File parentFile = f.getParentFile();
        // 输出信息
        System.out.println("文件名：" + filename);
        System.out.println("文件大小：" + filesize);
        System.out.println("文件路径：" + path);
        System.out.println("文件父路径：" + parentPath);
        System.out.println("文件父路径：" + parentFile);
    }
}
