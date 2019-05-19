package basic.sea.jvm;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/23 0023 20:11
 */
public class Demo3MavMemory {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);
        System.out.println(Runtime.getRuntime().totalMemory()/(1024*1024));
    }
}
