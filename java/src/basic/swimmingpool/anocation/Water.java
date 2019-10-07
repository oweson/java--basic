package basic.swimmingpool.anocation;

import java.lang.annotation.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/10/7 21:53
 */

/**
 * 始终不会丢弃，可以使用反射获得该注解的信息。自定义的注解最常用的使用方式。
 * RetentionPolicy.RUNTIME;
 *
 * @Documented 表示是否将此注解的相关信息添加到javadoc文档中;
 * @Inherited 定义该注解和子类的关系，使用此注解声明出来的自定义注解，在使用在类上面时，子类会自动继承此注解，否则，子类不会继承此注解。
 * 注意，使用@Inherited声明出来的注解，只有在类上使用时才会有效，对方法，属性等其他无效。
 */
@Documented
@Inherited
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Water {
    /**
     * 我们前面已经提到光配置了注解，其实没有作用，需要通过相应的代码来实现该注解想要表达的逻辑。
     * <p>
     * 注解定义后也是一种class，所有的注解都继承自java.lang.annotation.Annotation，因此，读取注解，需要使用反射API。
     */
    String value() default "";
    /**public static void main(String[] args) throws ClassNotFoundException {
     List<String> columNames = new ArrayList<>();
     Class clazz = Class.forName("annotation.Person");
     //获取Person类所有属性
     Field[] fields = clazz.getDeclaredFields();
     for (Field field : fields){
     //获取该属性的Colum注解
     Colum colum = field.getAnnotation(Colum.class);
     //或者可以先判断有无该注解
     field.isAnnotationPresent(Colum.class);
     //将该属性通过注解配置好的中文含义取出来放到集合中
     columNames.add(colum.name());
     }

     //打印集合
     columNames.forEach((columName) -> System.out.println(columName));
     ————————————————
     版权声明：本文为CSDN博主「工匠初心」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
     原文链接：https://blog.csdn.net/fengdongsuixin/article/details/102158131*/
}
