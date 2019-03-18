package top.sea521.algorithm;

import org.junit.Test;

import java.util.Scanner;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/12/30 0030 16:41
 */
public class CountCharcterTest {
    @Test
    public void demo1() {
        /**原生的api测试；
         *   for(int i=0;i<str.length();i++){
         *    char c=str.charAt(i);
         *    int value=(int)c;
         *    if(value==32){
         *     ++space;//空格
         *    }else if(value>=48 && value<=57){
         *     ++num;//数字
         *    }else if((value>=65 && value<=90) || (value>=97 && value<=122) ){
         *     ++letter;//字符
         *    }else{
         *    //别的
         *     ++other;
         *    }*/

        System.out.println('0' + 12);
    }

    public static void main(String[] args) {
        CountSth();
        /**题目：输入一行字符，分别统计出其中英文字母、空格、
         * 数字和其它字符的个数。*/
        System.out.println("输入一串字符串......");
        Scanner sc = new Scanner(System.in);
        String nextLine = sc.nextLine();
        int digital = 0;
        int character = 0;
        int other = 0;
        int blank = 0;
        char[] ch = null;
        ch = nextLine.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                digital++;
            } else if (Character.isLetter(ch[i])) {
                character++;
            } else if (Character.isSpaceChar(ch[i])) {
                blank++;
            } else {
                other++;
            }

        }

        System.out.println("数字个数: " + digital);
        System.out.println("英文字母个数: " + character);
        System.out.println("空格个数: " + blank);
        System.out.println("其他字符个数:" + other);
    }

    private static void CountSth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("录入");
        int letter=0;
        int number=0;
        int other=0;

        char[] charArray = sc.nextLine().toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])){
                letter++;
            }
            else if(Character.isDigit(charArray[i])){
                number++;

            }
            else {
                other++;
            }

        }
        System.out.println("letter:"+letter+"number:"+number+"other"+other);
    }

}

