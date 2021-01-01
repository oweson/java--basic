package basic.cloudcode;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/7/20 15:23
 */
public class Hello {
    public class Hello02 {
        public class Hello03 {
            // 嵌套类不能有static的方法！！！
            public void demo1() {
                System.out.println("我是第三层的嵌套类！！！");
            }

        }

    }

    public static void main(String[] args) {
    }
}
