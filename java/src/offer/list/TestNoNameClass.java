package offer.list;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/21 0021 16:55
 */
public class TestNoNameClass {
    public static void main(String[] args) {
        NoNameClass noNameClass = new NoNameClass() {
            @Override
            public void say() {
                System.out.println("我是匿名内部类》。。。。。。。。。。。。。。");
            }
        };
        noNameClass.say();
    }
}
