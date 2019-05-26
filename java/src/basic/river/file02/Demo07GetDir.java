package basic.river.file02;

import java.io.File;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 12:10
 */
public class Demo07GetDir {
    /**
     * 描述:
     * 获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
     * 注意：不包含子文件夹下的文件
     * 答案
     * 操作步骤:
     * 1.创建文件对象关联到指定文件夹，比如：c:/aaa
     * 2.调用文件对象的listFiles方法获得文件数组
     * 3.遍历文件数组将每一个文件的名字输出到控制台
     */
    public static void main(String[] args) {
        // 创建文件对象
        File f = new File("e:/a");
        // 获得文件夹下所有文件包含文件夹
        File[] files = f.listFiles();
        // 遍历文件数组
        for (File file : files) {
            // 将文件的名字打印到控制台
            System.out.println(file.getName());
        }
    }
}
