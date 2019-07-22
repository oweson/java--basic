
package pig.easyfalse;

/**
 * @author chengwanli
 * @time 2019年5月10日上午9:24:50
 */
public class Demo7IntegerTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Long long1 = 100L;
        Integer aInteger = 121;
        Integer aInteger2 = 121;
        System.out.println(aInteger == aInteger2);
        // 1 true;
        Integer aInteger3 = 211;
        Integer aInteger4 = 211;
        System.out.println(aInteger3 == aInteger4);
        //  2 false

    }

}
