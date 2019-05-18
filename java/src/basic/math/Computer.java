package basic.math;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/29 0029 19:36
 */
public class Computer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String next = scanner.next();
        int b = scanner.nextInt();
        String count = count(a, next, b);
        System.out.println(a +next +b +"="+count);
    }

    public static String count(int a, String op , int b ){
        int r=0;
        if ("+".equals(op)){
            r = a+b;
        }else  if ("-".equals(op)){
            r = a-b;
        }else  if ("*".equals(op)){
            r = a*b;
        }else  if ("/".equals(op)){
            r = a/b;
        }else  if ("%".equals(op)){
            r = a%b;
        }else {
            return null;
        }

        return r+"";
    }
}
