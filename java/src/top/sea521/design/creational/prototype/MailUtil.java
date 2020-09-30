package top.sea521.design.creational.prototype;

import java.text.MessageFormat;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 20:16
 */
public class MailUtil {
    public static void sendEmail(Mail email) {
        String content = "像{0}同学发生{1}，哈哈{2}";
        System.out.println(MessageFormat.format(content, email.getName(), email.getContent(), email.getEmailAddress()));
    }

    public static void saveEmail(Mail mail) {
        System.out.println(mail.getContent() + "save");
    }


}
