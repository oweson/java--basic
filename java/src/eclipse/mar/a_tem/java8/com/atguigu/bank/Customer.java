package eclipse.mar.a_tem.java8.com.atguigu.bank;

import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/15 0015 16:33
 */
public class Customer {
    private String firstName;
    private String lastName;
    /**一个人有多个账户*/
    private List<Account> accounts;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
