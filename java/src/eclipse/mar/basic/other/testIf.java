package eclipse.mar.basic.other;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/11 0011 14:41
 */
public class testIf {
    public static int testSth(){
        int sum=1000;
        if(sum>200000){
            /**if不满住就直接走其他的相当于else*/
            return 100;
        }
        return -1;
    }
    public static void main(String[] args) {
        int i = testSth();
        System.out.println(i);
        int a=100;

    }
}
