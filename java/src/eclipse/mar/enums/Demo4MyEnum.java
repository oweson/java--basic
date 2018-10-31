package eclipse.mar.enums;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月23日 下午9:23:16 类说明：侵权必究。。。。。。。
 */

public enum Demo4MyEnum {
    a("xijinping"), b("telangpu");
    String name;

    private Demo4MyEnum(String name) {
        this.name = name;
        // TODO Auto-generated constructor stub
    }

    String getName() {
        return name;

    }


}
