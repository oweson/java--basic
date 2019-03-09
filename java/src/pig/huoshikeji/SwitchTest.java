package pig.huoshikeji;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/3/8 0008 18:46
 */
public class SwitchTest {
    public static void main(String[] args) {
        int x=6,y=10,k=5;
        switch (x%y){
            case 0 : k=x*y;
            case 6 : k=x/y;
            case 12 : k=x*y-x;
            default:k=x*y-x;

        }
        System.out.println(k);
        //54
    }
}
