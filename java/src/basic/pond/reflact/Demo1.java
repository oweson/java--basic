package basic.pond.reflact;

import basic.pond.pojo.GoldenFish;
import top.sea521.design.structural.facade.v2.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author chengwanli
 * @date 2020/10/11 12:18
 */


public class Demo1 {
    public static void main(String[] args) {
        printClassMessage(new GoldenFish());
    }
    //获取类的成员函数 成员变量 （类的构造方法等信息）

    public static void printClassMessage(Object obj) {
        Class c = obj.getClass();
        System.out.println("类的名称是" + c.getName());
        Method[] ms = c.getMethods();
        // 1 获取所有public函数 包括父类继承来的
        Method[] ms2 = c.getDeclaredMethods();
        // 2 获取所有自己声明的方法
        for (int i = 0; i < ms.length; i++) {
            //getReturnType获取方法返回值类型的类类型 如int.class
            //int.class.getName才可以得到int

            Class returntype = ms[i].getReturnType();
            System.out.print(returntype.getName() + " ");
            //某个具体的方法对象 getName() 获取方法名
            System.out.print(ms[i].getName() + "(");
            //	获取参数类型 ---参数列表的类型的类类型
            Class[] paramTypes = ms[i].getParameterTypes();
            for (Class class1 : paramTypes) {
                System.out.print(class1.getName() + ",");
            }
            System.out.println(")");

        }
        /*
         * 成员变量也是对象
         * java.lang.reflect.Field
         * Field封装了关于成员变量的操作
         * getFields()获取public成员变量信息
         * getDeclaredFields()获取该类自己声明的成员变量的信息
         * */
        Field[] fs = c.getDeclaredFields();
        for (Field field : fs) {
            //得到成员变量类型的类类型 如成员变量类型是int
            //得到int.class
            Class fieldType = field.getType();
            String typename = fieldType.getName();

            //得到成员变量的名字
            String fieldName = field.getName();
            System.out.println(typename + " " + fieldName);
        }
    }

    public static void printConMessage(Object obj) {
        Class c = obj.getClass();
        /*
         * 构造函数也是对象
         * java.lang.Constructor中封装了构造函数的信息
         * getConstructors获取所有public构造函数
         * getDeclaredConstructord得到所有的自己声明的构造函数
         * */
        Constructor[] cs = c.getDeclaredConstructors();
        for (Constructor constructor : cs) {
            System.out.print(constructor.getName() + "(");
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class class1 : paramTypes) {
                System.out.print(class1.getName() + ",");
            }
            System.out.println(")");
        }
    }

}
