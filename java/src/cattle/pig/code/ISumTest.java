package cattle.pig.code;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 12:10
 */
public class ISumTest {
    /**基本类型和String是值传递，对象则是信用传递*/
    public static void main(String[] args) {
        ISumTest inc = new ISumTest();
        int i = 0;
        inc.fermin(i);
        i = i++;
        System.out.println(i);
        //0

    }

    void fermin(int i) {
        i++;
    }
}
