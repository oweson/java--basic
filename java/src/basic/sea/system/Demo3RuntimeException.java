package basic.sea.system;

import java.io.IOException;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/11 0011 15:24
 */
public class Demo3RuntimeException {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        Process ppx = runtime.exec("Pig.java");
        // //运行指定的程序
        Thread.sleep(1200);
        ppx.destroy();
    }
}
