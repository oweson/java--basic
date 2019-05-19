package basic.pond.math;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/26 0026 15:43
 */
public class GeneratorNumber {
    /**
     * 1 生成一个随机100内小数，转换为保留两位小数的字符串，不考虑四舍五入的问题。
     */
    public static void main(String[] args) {

        double random = Math.random() * 100;
        System.out.println("生成的随机数是" + random);
        String str = random + "";
        /**小数点出现的下标；*/
        int index = str.indexOf(".");
        System.out.println(index);
        /**截串*/
        String substring = str.substring(0, index + 3);
        System.out.println(substring);

    }
}
