package eclipse.mar.other;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/21 0021 15:08
 */
public class TestLocalVariable {
    @Test
    public void stringCreation() {
        final String helloString1 = new String("Hello World!");
        final String helloString2 = "Hello World!";
        assertEquals(helloString1, helloString2);
    }

    @Test
    public void stringChanges() {
        final String greeting = "Good Morning, Dave";
        final String substring = greeting.substring(4);

        assertTrue(substring.equals("Good"));
        assertFalse(greeting.equals(substring));
        assertTrue(greeting.equals("Good Morning, Dave"));
    }

    @Test
    public void intEquality() {
        // Explicitly calling new String so the instances
        // are in different memory locations
        final Integer int1 = Integer.valueOf(new String("100"));
        final Integer int2 = Integer.valueOf(new String("100"));

        assertTrue(int1 == int2);
    }

    private void assertTrue(boolean b) {
    }

    @Test
    public void testDemo1() {
        int a = 100;
        /**期望100，实际就是100*/
        assertEquals(100, 100);
    }

    int a;

    public int addOne(final int x) {
        /**局部变量被修饰不可进行++操作；*/
        //return ++x;
        System.out.println(a);

        return 0;
        //
    }

    public static void testSth() {
        /**在方法的内部，局部的变量不允许使用权限修饰符*/
        /**final是可以修饰的*/
        final int age = 101;
    }

    public static void main(String[] args) {
        System.out.println(new TestLocalVariable().addOne(100));
        /**非静态变量不能直接在static中使用；非static方法是可以直接使用的*/

    }
}
