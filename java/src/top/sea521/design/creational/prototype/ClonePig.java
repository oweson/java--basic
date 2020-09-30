package top.sea521.design.creational.prototype;

import java.util.Date;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 20:35
 */
public class ClonePig implements Cloneable {
    private String name;
    private Date date;

    public ClonePig(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        /**这样就不会浅的克隆了，只是更改修改的哪个*/
        ClonePig clone = (ClonePig) super.clone();
        clone.date = (Date) clone.date.clone();
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ClonePig{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}' + super.toString();
    }
}
