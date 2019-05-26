package basic.river.file02;

import java.io.File;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 12:03
 */
public class Demo04DeleteFile {
    /**
     * 描述:
     * 将D盘下a.txt文件删除
     * 将D盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹。
     * 答案:
     * 操作步骤:
     * 1.创建文件对象关联路径：d:/a.txt
     * 2.调用文件对象删除文件的方法
     * 3.创建文件对象关联路径：d:/aaa
     * 4.调用文件对象删除文件夹的方法
     */
    public static void main(String[] args) {
        // 创建文件对象
        File f = new File("d:/a.txt");
        // 删除文件
        f.delete();

        // 创建文件夹对象
        File dir = new File("d:/aaa");
        // 删除文件夹
        dir.delete();
    }
}
