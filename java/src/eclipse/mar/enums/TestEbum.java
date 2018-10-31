package eclipse.mar.enums;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年4月26日 下午5:16:36 类说明：侵权必究。。。。。。。
 */

public class TestEbum {
    public static void main(String[] args) {
        System.out.println(CompanyEnum.getCodeByCompany("顺丰速运"));
        System.out.println(CompanyEnum.findCodeByCompanyName("申通物流"));
        System.out.println(CompanyEnum.getCompanyByCode(1001));
        System.out.println("-----------------------------");

        System.out.println(CompanyEnum.SF.getCode());
        System.out.println(CompanyEnum.SF.getCompany());
        System.out.println(CompanyEnum.YD.getCode());
        System.out.println(CompanyEnum.YD.getCode());
        System.out.println();
    }

}
