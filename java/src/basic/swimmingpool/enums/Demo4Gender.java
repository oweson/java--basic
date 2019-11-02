package basic.swimmingpool.enums;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月26日 下午5:19:46
 * 类说明：侵权必究。。。。。。。
 */

public enum Demo4Gender {
    GENDER(1), CODE(2), HAHA(3);
    private int code;
    /*因为只有get所以只能得到不能设置*/

    public int getCode() {
        return code;
    }

    Demo4Gender(int code) {
        this.code = code;
    }

}
