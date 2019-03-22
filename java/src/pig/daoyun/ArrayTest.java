package pig.daoyun;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/20 0020 8:48
 */
public class ArrayTest {
    // 构造函数可以修饰符不同；
    ArrayTest() {
    }

    private ArrayTest(int a) {
    }

    public static void main(String[] args) {
        // 数组的局部或者成员变量都会初始化默认值；
        int[] arr = new int[10];
        System.out.println(arr[0]);
    }
}
