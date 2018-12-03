package top.sea521.factory.prototype;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 20:12
 */
public class Mail implements Cloneable{
    private String name;
    private String  content;
    private String emailAddress;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("我是克隆方法..............");
        return super.clone();
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
