package pig.dog.offer.question.jiuyuankeji;

import java.util.HashMap;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/4 19:12
 */
public class Demo4ForceTransfer {
    public static void main(String[] args) {
        /** 低到高：自动的转换；
         * 高到低：强制转换！
         * 强制类型转换可能会造成数据的丢失哦，小伙伴们在应用时一定要慎重哦！*/
        Object object = 120;
        Integer object1 = (Integer) object;
        Object object02 = new HashMap<>();
        HashMap object021 = (HashMap) object02;
        System.out.println(object1);
        System.out.println(object021.size() + "      ==================================");
    }
}
