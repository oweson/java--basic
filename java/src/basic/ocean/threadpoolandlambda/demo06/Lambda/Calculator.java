package basic.ocean.threadpoolandlambda.demo06.Lambda;
/**
    给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
 */
@FunctionalInterface
public interface Calculator {
    int calc(int a, int b);
}
