package basic.river.file02;

import java.io.File;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 12:00
 */
public class Demo03Mkdir {
    public static final void ManyDirCreate(){
        /**描述:在D盘下创建一个名为ccc的文件夹，要求如下：
         1.ccc文件夹中要求包含bbb子文件夹
         2.bbb子文件夹要求包含aaa文件夹
         答案:
         操作步骤:
         1.创建文件对象关联路径：d:/ccc/bbb/aaa
         2.调用文件对象创建多级文件夹的方法*/

        // 创建文件对象
        File f = new File("d:/ccc/bbb/aaa");
        // 创建多级文件夹
        f.mkdirs();
    }
    /**描述:在D盘下创建一个名为bbb的文件夹。
     答案
     操作步骤:
     1.创建文件对象指定路径为d:/bbb
     2.调用文件对象创建文件夹的方法*/
    public static void main(String[] args) {
        // 创建文件对象
        File f = new File("d:/bbb");
        // 创建单级文件夹
        f.mkdir();
    }
}
