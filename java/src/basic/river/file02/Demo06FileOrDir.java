package basic.river.file02;

import java.io.File;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/26 0026 12:09
 */
public class Demo06FileOrDir {
    /**描述:
     1.判断File对象是否是文件,是文件则输出：xxx是一个文件，否则输出：xxx不是一个文件。
     2.判断File对象是否是文件夹,是文件夹则输出：xxx是一个文件夹，否则输出：xxx不是一个文件夹。(xxx是文件名或文件夹名)
     答案:
     操作步骤:
     1.创建两个文件对象分别关联到不同的文件，比如：d:/a.txt，d:/aaa
     2.调用文件对象的判断是否是文件或是否是文件夹的方法
     3.获得文件名，根据判断结果输出信息。*/
    public static void main(String[] args) {
        // 创建文件对象
        File f1 = new File("d:/b.txt");
        // 判断是否是一个文件
        if(f1.isFile()) {
            System.out.println(f1.getName()+"是一个文件");
        }  else {
            System.out.println(f1.getName()+"不是一个文件");
        }
        // 创建文件对象
        File f2 = new File("d:/aaaa");
        // 判断是否是一个文件夹
        if(f2.isDirectory()) {
            System.out.println(f2.getName()+"是一个文件夹");
        }  else {
            System.out.println(f2.getName()+"不是一个文件夹");
        }
    }
}
