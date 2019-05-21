package basic.lake.collections;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/21 0021 22:59
 */
class Students {
    int age = 100;

    @Override
    public String toString() {
        return "Student [age=" + age + "]";
    }

    public Students(int age) {
        // super();
        this.age = age;
    }

}
