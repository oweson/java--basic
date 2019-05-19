package basic.latest.java8.com.atguigu.bank;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/15 0015 16:08
 */
public class Account {
    public Account() {
    }

    private Integer balance = 10000;

    public Account(Integer balance) {
        this.balance = balance;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    private void totalMoney() {
        System.out.println("当前余额是：" + balance);
    }

    private void addMoney(Integer money) {
        balance += money;
        System.out.println(balance);

    }

    private void subjectMoney(Integer money) throws BankException01 {
        if(balance<money){
            throw new BankException01("余额不足",balance);
        }
        balance -= money;
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Account d = new Account();
        Integer balance = d.getBalance();
        System.out.println(balance);
        d.addMoney(1000);
        d.subjectMoney(1000000);
        d.getBalance();
        d.totalMoney();
    }
}
