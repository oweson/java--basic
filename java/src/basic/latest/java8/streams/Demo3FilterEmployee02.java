package basic.latest.java8.streams;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/20 0020 22:51
 */

/**
 * 传入employee对象进行比较
 */
public class Demo3FilterEmployee02 implements IEmployee<Demo2FilteEmployee> {
    @Override
    public Boolean testSth(Demo2FilteEmployee filteEmployee) {
        return filteEmployee.getAge() >= 21;
    }
}
