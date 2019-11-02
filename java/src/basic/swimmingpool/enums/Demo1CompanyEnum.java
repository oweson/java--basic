package basic.swimmingpool.enums;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月26日 下午5:15:36 类说明：侵权必究。。。。。。。
 */

public enum Demo1CompanyEnum {
    /**
     * 虽然在代码中并没有申明enum构造器访问级别,但却不是default,
     * 而是private.
     * 当我们试着使用new FruitEnum的时候编译器就会报错.
     * 当我们在构造器前面加上private的时候.编译器提示我们redundant(多余的).
     */
    SF("顺丰速运", 1001), YTO("圆通速递", 1002),
    STO("申通物流", 1003), YD("韵达快运", 1004),
    YZPY("中国邮政", 1005);

    Demo1CompanyEnum(String company, int code) {
        this.company = company;
        this.code = code;
    }

    /**
     * 1 公司名称
     */
    private String company;
    /**
     * 2 公司编码
     */

    private int code;

    public String getCompany() {
        return company;
    }


    public int getCode() {
        return code;
    }


    /**
     * 1 根据公司的名字得到对应的编码
     */
    public static int findCodeByCompanyName(String companyName) {
        for (Demo1CompanyEnum c : Demo1CompanyEnum.values()) {
            if (c.getCompany().equals(companyName.trim())) {
                return c.code;
                // 直接类名点调用就可以了
            }
            return 0;
        }
        return 0;
    }


    /**
     * 2 根据物流公司编码获取对应的名字
     */
    public static String getCompanyByCode(int code) {
        for (Demo1CompanyEnum c : Demo1CompanyEnum.values()) {
            if (c.getCode() == code) {
                return c.getCompany();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String name = SF.name();
        System.out.println(name);
        // 1 得到name;
        int ordinal = SF.ordinal();
        System.out.println(ordinal);
        // 2 下标顺序
        int code = SF.code;
        String company = SF.company;
        System.out.println("code is ;" + code + "company is ;" + company);
    }
}