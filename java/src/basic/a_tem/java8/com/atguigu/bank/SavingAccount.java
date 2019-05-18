package basic.a_tem.java8.com.atguigu.bank;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/15 0015 16:37
 */
public class SavingAccount extends Account {
    private Integer inteRestRate;

    public SavingAccount(Integer balance, Integer inteRestRate) {
        super(balance);
        this.inteRestRate = inteRestRate;
    }
}
