package pig.offier;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/18 0018 21:15
 */
public class Demo1OneHundredSumOfEven {
    public static void demo2(){
        int sum=0;
        for (int i = 0; i < 101; i++) {
            if(i%2==1){
                continue;
            }
            sum+=i;

        }
        System.out.println("sum is"+sum);
    }
    public static void main(String[] args) {
        demo2();
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
            }

        }
        System.out.println("sum is" + sum);
    }
}
