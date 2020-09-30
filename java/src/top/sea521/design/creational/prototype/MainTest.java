package top.sea521.design.creational.prototype;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 20:19
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版");
        for (int i = 0; i < 10; i++) {
            Mail clone = (Mail) mail.clone();
            clone.setName("ppx"+i);
            clone.setName("你好啊"+i);
            clone.setEmailAddress("河南"+i);
            MailUtil.sendEmail(clone);

        }
        MailUtil.saveEmail(mail);
    }
}
