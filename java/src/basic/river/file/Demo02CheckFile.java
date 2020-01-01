package basic.river.file;

import java.io.File;
import java.io.IOException;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 11:55
 */
public class Demo02CheckFile {
    /**
     * 检查文件是否存在,文件的创建
     * 描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
     * 操作步骤:
     * 1.使用绝对路径创建对象关联到D盘的a.txt。
     * 2.通过文件对象方法判断文件是否存在。
     * 3.不存在则调用创建文件的方法创建文件。
     */
    // 创建文件对象：绝对路径
    public static void main(String[] args) {
        // 仅仅是一个文件对象！还没有创建！
        File f = new File("e:/a.txt");
        // 如果文件不存在，则创建文件
        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
