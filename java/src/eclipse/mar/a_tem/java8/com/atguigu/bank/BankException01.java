package eclipse.mar.a_tem.java8.com.atguigu.bank;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/15 0015 16:23
 */
public class BankException01 extends RuntimeException {
    private Integer deficit;

    public Integer getDeficit() {
        return deficit;
    }

    public void setDeficit(Integer deficit) {
        this.deficit = deficit;
    }

    public BankException01() {
        super();
    }

    public BankException01(String message,Integer id) {
        super(message);
    }


}
