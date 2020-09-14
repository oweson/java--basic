package basic.geeck;

import java.util.Optional;

/**
 * @author chengwanli
 * @date 2020/9/14 11:51
 */


public class OptionOfTest {
    public static void main(String[] args) {
        //Optional.of(null);
        // Exception in thread "main" java.lang.NullPointerException
        Optional.of("");
    }
}
