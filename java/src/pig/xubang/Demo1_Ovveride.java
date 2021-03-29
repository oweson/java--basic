package pig.xubang;

/**
 * @author oweson
 * @date 2021/3/29 21:16
 */


public class Demo1_Ovveride {
    public Demo1_Ovveride(Integer i){
        System.out.println(i);
    }
    public Demo1_Ovveride(Long i){
        System.out.println(i);
    }
    public Demo1_Ovveride(Double i){
        System.out.println(i);
    }
    public Demo1_Ovveride(Float i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        // double 类型，类型提升！
        new Demo1_Ovveride(100.0*100);

    }
}
