package top.sea521.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/17 21:30
 */
@Target(ElementType.METHOD)
public @interface Dog {
    /** target
     * 1 用于描述注解的使用范围,有一个枚举ElementType来指定,具体如下:
     CONSTRUCTOR:用于描述构造器
     FIELD:用于描述域
     LOCAL_VARIABLE:用于描述局部变量
     METHOD:用于描述方法
     PACKAGE:用于描述包
     PARAMETER:用于描述参数
     TYPE:用于描述类、接口(包括注解类型) 或enum声明
     */
    // 大家可以看到，我这个Dog注解，只能用到方法上面


}
