package basic.river.file;

import java.io.File;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 11:53
 */
public class Demo1FileCreate {
    /**
     * 创建两个文件对象，分别使用相对路径和绝对路径创建。
     */
    public static void main(String[] args) {
        // 1 创建文件对象：绝对路径
        File f1 = new File("d:/aaa/a.txt");
        //  2 创建文件对象：相对路径
        File f2 = new File("a.txt");
    }
}
