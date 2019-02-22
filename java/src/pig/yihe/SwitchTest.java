package pig.yihe;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/2/21 0021 21:02
 */
public class SwitchTest {
    static int getValue(int i){
        int result=0;
        switch (i){
            case 1:
                result+=i;
            case 2:
                result=result+i*2;
            case 4:
                result=result+i*3;
            case 8:
                result=result+i*4;
        }
        return result;
    }

    public static void main(String[] args) {
        int value = getValue(2);
        System.out.println(value);
        // 18;没有break满足第一个继续运行完毕；

    }
}
