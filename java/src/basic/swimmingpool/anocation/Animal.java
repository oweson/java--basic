package basic.swimmingpool.anocation;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/10/7 21:50
 */

/**
 * 我们上面定义的注解主要用到了String类型，但实际上还可以是基本数据类型（不能为包装类）、枚举类型。
 * 注解也有一个约定俗成的东西，最常用的参数应该命名为value，同时一般情况下我们都会通过default参数设置一个默认值
 */
public @interface Animal {
    String value() default "";

    int age() default 101;


}
