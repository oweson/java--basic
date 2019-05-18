package basic.enums;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月23日 下午9:25:41 类说明：侵权必究。。。。。。。
 */

public class TestEnum04 {
    public static void main(String[] args) {
        for (Demo4MyEnum hee : Demo4MyEnum.values()) {
            System.out.println(hee.getName());
            /** 得到对象，然后调去里面的方法取值 */
        }
    }

}
