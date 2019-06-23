package basic.pond.array.core;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/5 0005 14:55
 */
public class ArrayTest {
    public static final void printTwoArray() {
        /*
         * A:案例演示
         * 需求：二维数组遍历

         * 外循环控制的是二维数组的长度，其实就是一维数组的个数。
         * 内循环控制的是一维数组的长度。

         */
        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        for (int i = 0; i < arr.length; i++) {
            //获取到每个二维数组中的一维数组
            for (int j = 0; j < arr[i].length; j++) {
                //获取每个一维数组中的元素
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static final void addressOrValue() {
        /**
         基本数据类型的值传递,不改变原值,因为调用后就会弹栈,局部变量随之消失
         引用数据类型的值传递,改变原值,因为即使方法弹栈,但是堆内存数组对象还在,可以通过地址继续访问

         Java中到底是传值还是传址
         1,既是传值,也是传地址,基本数据类型传递的值,引用数据类型传递的地址
         2,java中只有传值,因为地址值也是值(出去面试都说这种,支持者是高司令(java之父))
         */
        /*int a = 10;
		int b = 20;
		System.out.println("a:"+a+",b:"+b);
		//a = 10,b = 20
		change(a,b);
		System.out.println("a:"+a+",b:"+b);
		//?*/

        int[] arr = {1, 2, 3, 4, 5};
        change(arr);
        System.out.println(arr[1]);
    }

    public static void change(int a, int b) {
        //a = 10, b= 20
        System.out.println("a:" + a + ",b:" + b);
        //a = 10,b = 20
        a = b;
        //a = 20
        b = a + b;
        //b = 40
        System.out.println("a:" + a + ",b:" + b);
        //a = 20, b = 40
    }

    public static void change(int[] arr) {            //1,4,3,8,5
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 == 0) {
                arr[x] *= 2;
            }
        }
    }

    public static void main(String[] args) {
        printTwoArray();
        int[][] arr = new int[3][2];
        /**
         这是一个二维数组
         这个二维数组中有3个一维数组
         每个一维数组中有2个元素

         [[I@19bb25a
         //二维数组的地址值
         [I@da6bf4
         //一维数组的地址值
         0
         //元素值

         */
        System.out.println(arr);
        //二维数组地址值
        System.out.println(arr[0]);
        //二维数组中的第一个一维数组的地址值
        System.out.println(arr[0][0]);
        //二维数组中的第一个一维数组的第一个元素

    }
}
