package top.sea521.algorithm.leetcode;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/9 11:47
 */
public class Demo2SumNumber {
    public static void sum(int i,int j){
        int sum=0;
        for (int k = i; k <=j ; k++) {
            sum+=k;

        }
        System.out.println(i+"  ...."+j+"之间的和是："+sum);
    }
    public static void main(String[] args) {
        sum(90,100);
        sum(1,100);

    }
}
