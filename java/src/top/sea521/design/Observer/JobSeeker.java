package top.sea521.design.Observer;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/10 21:12
 */
public class JobSeeker implements  Observer {
    private String name;
     // 1 构造函数赋值
    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject s) {
        System.out.println(this.name + " got notified!");
        System.out.println(s);
    }


}
