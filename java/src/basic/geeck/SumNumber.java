package basic.geeck;

public class SumNumber {
    public static void main(String[] args) {
        //  1-10000000
        long begin = System.currentTimeMillis();
        System.out.println(begin);
        Long sum=0L;
       sum= 1000000000L*(1000000000+1)/2;
//        for (int i = 0; i < 1000000000; i++) {
//            sum+=i;
//
//        }
        //  499999999500000000
        // 1:5000  差距很大；
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println(sum);
        System.out.println((long)(end-begin));
        // int 溢出！
    }
}
