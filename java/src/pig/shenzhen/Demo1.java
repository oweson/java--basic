package pig.shenzhen;

import java.util.HashSet;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/7/12 22:07
 */
public class Demo1 {
    public static void SetTest(){
        HashSet set = new HashSet<Integer>();
        for (int i = 0; i < 5; i++) {
            set.add(i);
            set.remove(2);

        }
        for (int i = 0; i < set.size(); i++) {
            System.out.println(i);

        }
    }
    public static void main(String[] args) {
        SetTest();
        int num=2;
        System.out.println(++num*3);
        // 9
        //  short为一种数据类型，范围-32768~+32767
        //
        int i = 891 % 10;
        System.out.println(i);
        //个位：

        int shiwei = 89898921/10%10;
        //十位
        System.out.println(shiwei);
        int qianwei = 89898921/100%10;
        System.out.println(qianwei);



    }
}
