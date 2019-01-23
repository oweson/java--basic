package top.sea521.factory.singleton;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/23 0023 11:15
 */
public enum MyEnum {
    /**
     * 默认public static final
     */
    INSTANCE;
    /**
     * 枚举里的属性相当于Singleton的实例
     */

    private Student student;

    MyEnum() {
        student = new Student();

    }

    public Student getStudent() {
        return student;
    }

}
