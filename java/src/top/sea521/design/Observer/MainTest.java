package top.sea521.design.Observer;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/10 21:13
 */
public class MainTest {
    public static void main(String[] args) {
        // 1 在构造器里面是咧话参数；
        HeadHunter hh = new HeadHunter();

        JobSeeker lbd = new JobSeeker("aaa");
        JobSeeker lbx = new JobSeeker("bbb");
        JobSeeker lbn = new JobSeeker("ccc");
        JobSeeker lbb = new JobSeeker("ddd");

        hh.registerObserver(lbd);
        hh.registerObserver(lbx);
        hh.registerObserver(lbn);
        hh.registerObserver(lbb);
        hh.removeObserver(lbb);

        hh.addJob("looking for Java engineers");
        hh.addJob("looking for Python engineers");
    }


}
