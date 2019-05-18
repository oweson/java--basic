package basic.utils;

/**
 * @Author:oweson
 * @Date :2018/5/23 0023 22:13
 * @色厉而胆薄，好谋而寡断
 */
/**
 * A:二进制字面量
 * B:数字字面量可以出现下划线
 * C:switch 语句可以用字符串
 * D:泛型简化,菱形泛型
 * E:异常的多个catch合并,每个异常用或|
 * F:try-with-resources 语句,1.7版标准的异常处理代码
 *
 * 100_000
 */
public class Jdk17 {
    int age;
    String name;

    public Jdk17(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Jdk17() {

    }

    public static void main(String[] args) {
        System.out.println(0b1010);
        System.out.println(100_200);

    }
}
