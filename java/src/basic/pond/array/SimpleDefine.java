package basic.pond.array;

public class SimpleDefine {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        change(a, b);
        System.out.println(a + "\t" + b);
        // 1 基本数据类型是值用，会弹栈；
        String x = new String("hello");
        String y = new String("world");
        come(x, y);
        System.out.println(x + "\t\t\t" + y);


        //demo5();

        /*
         * A:案例演示
         *
         * 需求：公司年销售额求和 某公司按照季度和月份统计的数据如下：单位(万元) 第一季度：22,66,44 第二季度：77,33,88
         * 第三季度：25,45,65 第四季度：11,66,99
         */

        // demo4();
        // demo2();
        // demo1(); //打印二维数组中的第一个一维数组中的第一个元素
        // TODO Auto-generated method stub

    }

    private static void come(String x, String y) {
        x = y;
        y = x;
        System.out.println(x + "\t" + y);
        // TODO Auto-generated method stub

    }

    private static void change(int a, int b) {
        a = b;
        a = a + b;
        System.out.println(a + "\t" + b);

    }

    private static void demo5() {
        int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65},{11, 66, 99}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }

        }

        System.out.println(sum);
    }

    private static void demo4() {
        int[][] arr = {{1, 2, 3}, {3, 2, 1}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");

            }

        }
    }

    private static void demo3() {
        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}}; // 这是一个二维数组,这个二维数组中每个大括号都代表一个一维数组
        System.out.println(arr); // [[I@19bb25a,二维数组的地址值
        System.out.println(arr[2]); // [I@da6bf4,一维数组的地址值
        System.out.println(arr[0][0]);
    }

    private static void demo2() {
        int[][] arr = new int[3][];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr[0] = new int[10];
        arr[1] = new int[100];
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
    }

    private static void demo1() {
        int[][] arr = new int[3][2];
        System.out.println(arr);
        System.out.println(arr[0][0]);
        System.out.println(arr[0]);
        int[][] arr1 = new int[3][2];

        System.out.println(arr1); // 打印二维数组
        System.out.println(arr1[0]); // 打印二维数组中的第一个一维数组
        System.out.println(arr1[0][0]);
    }

}
