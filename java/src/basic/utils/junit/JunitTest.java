package basic.utils.junit;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/7 0007 14:39
 */
public class JunitTest {
    @Test(timeout = 1)
    @Ignore
    /**忽略这个测试*/
    public void demo1() {
        //assertEquals(1=);
        assertEquals(21L, 21L);
        System.out.println(100);

        //throw new ArithmeticException("kaksaksjaksas");
    }

    @Test(expected = ArithmeticException.class)
    public void demo2() {
        System.out.println(1 / 0);
        // fail("erhsahdgasjdasdasd");
        /**测试异常*/

    }

    @Test
    public void demo3() {
        System.out.println(1 / 2);
        //fail("alsalsklasAS");
    }

    public static void main(String[] args) {

    }

}
