package top.sea521.design.creational.prototype;

import java.util.ArrayList;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 20:19
 */
public class MainTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Mail> mailArrayList = new ArrayList<>();
        Mail mail = new Mail();
        mail.setContent("初始化模版");
        for (int i = 0; i < 2; i++) {
            Mail clone = (Mail) mail.clone();
            clone.setName("ppx"+i);
            clone.setName("你好啊"+i);
            clone.setEmailAddress("河南"+i);
            MailUtil.sendEmail(clone);
            mailArrayList.add(clone);

        }
       Mail fuck= (Mail)mail.clone();
        MailUtil.saveEmail(mail);
        mail.setContent("origin");
        mail.setEmailAddress("121@qq.com");
        mailArrayList.add(fuck);
        mailArrayList.add(mail);
        System.out.println(mailArrayList);
    }
}
