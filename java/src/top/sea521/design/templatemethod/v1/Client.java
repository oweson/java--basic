package top.sea521.design.templatemethod.v1;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 17:10
 */
public class Client {
    public static void main(String[] args) {
        ScanBicycle scanBicycle = new ScanBicycle();
        scanBicycle.use();
        System.out.println("========================");
        CodeBicycle codeBicycle = new CodeBicycle();
        codeBicycle.use();
    }
}
