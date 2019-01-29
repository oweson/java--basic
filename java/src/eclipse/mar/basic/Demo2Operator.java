package eclipse.mar.basic;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/20 0020 9:45
 */
public class Demo2Operator {
    public static void main(String[] args) {
        /**如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算
         比如
         int a = 5;
         long b = 6;
         a+b -> 结果类型是long;
         int a=1;
         long b=1;
         long l = a + b;
         System.out.println(l);*/
        /** 2 如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算
         byte a = 1;
         byte b= 2;
         a+b -> int 类型*/
        /** 3 % 取余数，又叫取模
         5除以2，余1*/
        /** 4 i++; 先取值，再运算
         ++i; 先运算，再取值*/
        /** 5 &
         &&	长路与 和 短路与	示例代码;长路与 两侧，都会被运算
         短路与 只要第一个是false，第二个就不进行运算了
         |
         ||	长路或 和 短路或;长路或 两侧都会被运算
         短路或 只要第一个是true的，第二个就不进行运算了*/
        /**  6 取反!
         真变为假
         假变为真*/
        /** 7 异或^
         不同，返回真
         相同，返回假*/
        /** 8 三元: boolean a=1>2?true:false;
         System.out.println(a);*/
        /** 9 ，需要用到从控制台输入数据，所以需要用到Scanner类:需要注意的是，
         * 如果在通过nextInt()读取了整数后，再接着读取字符串，
         * 读出来的是回车换行:"\r\n",因为nextInt仅仅读取数字信息，而不会读取回车换行"\r\n".

         所以，如果在业务上需要读取了整数后，接着读取字符串，
         那么就应该连续执行两次nextLine()，
         第一次是取走回车换行，第二次才是读取真正的字符串*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("int");
        float v = scanner.nextFloat();
        System.out.println(v);
        String s = scanner.nextLine();
        s = scanner.nextLine();
        System.out.println(s);


    }
}
