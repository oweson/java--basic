package basic.latest.java8;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/7/20 0020 22:51
 */
/**传入employee对象进行比较*/
public class FilterEmployee02 implements IEmployee<FilteEmployee> {
    @Override
    public Boolean testSth(FilteEmployee filteEmployee) {
        return filteEmployee.getAge()>=21;
    }
}
