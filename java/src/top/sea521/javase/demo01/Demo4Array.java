package top.sea521.javase.demo01;

import java.util.Arrays;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/20 0020 17:21
 */
public class Demo4Array {
    public static void main(String[] args) {
        /** 1 int[] a; 声明了一个数组变量。
         []表示该变量是一个数组
         int 表示数组里的每一个元素都是一个整数
         a 是变量名
         但是，仅仅是这一句声明，不会创建数组

         有时候也会写成int a[]; 没有任何区别，就是你看哪种顺眼的问题;
         如果变量代表一个数组，比如a,我们把a叫做引用
         与基本类型不同
         int c = 5; 这叫给c赋值为5
         声明一个引用 int[] a;
         a = new int[5];
         让a这个引用，指向数组*/
        /*int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            *//**注意加上括号在强制转换*//*
            a[i] = (int) (Math.random() * 100);

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }*/
        //todo 找出数组的最小值；
        /** 2 */
        //写法一： 分配空间同时赋值
       /* int[] a = new int[]{100,102,444,836,3236};

        //写法二： 省略了new int[],效果一样
        int[] b = {100,102,444,836,3236};

        //写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
        int[] c = new int[3]{100,102,444,836,3236};*/
      /*  3 填充数组，遍历；int[] a=new int[100];
        Arrays.fill(a,10);
        for (int i : a) {
            System.out.println(i);

        }*/
     /*  4 数组排序，int[] a={1,1,3,7,1,190};
      Arrays.sort(a);
        for (int i : a) {
            System.out.println(i);

        }
        System.out.println(a.toString());
*/
       /* 5 int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

        Arrays.sort(a);

        System.out.println(Arrays.toString(a));
        //使用binarySearch之前，必须先使用sort进行排序
        System.out.println("数字 62出现的位置:"+Arrays.binarySearch(a, 62));*/
    }
}
