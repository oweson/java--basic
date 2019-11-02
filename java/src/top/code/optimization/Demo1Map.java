package top.code.optimization;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/10/27 12:48
 */
public class Demo1Map {
    public static void main(String[] args) {
        // 1 遍历用entrySet,迭代entrySet() 获取Map 的key 和value
        // 2 使用Collection.isEmpty() 检测空;使用Collection.size()
        // 来检测是否为空在逻辑上没有问题，但是使用Collection.isEmpty() 使得代码更易读，
        // 并且可以获得更好的性能；除此之外，任何Collection.isEmpty() 实现的时间复杂度都是O(1) ，
        // 不需要多次循环遍历，但是某些通过Collection.size() 方法实现的时间复杂度可能是O(n)
        // 3 检测是否为null
        //CollectionUtils.isEmpty()
        // 4 初始化集合时尽量指定其大小
        // 5 使用StringBuilder 拼接字符串
        // 6 若需频繁调用Collection.contains 方法则使用Set;在Java 集合类库中，List的contains 方法普遍时间复杂度为O(n)，若代码中需要频繁调用contains 方法查找数据则先将集合list 转换成HashSet 实现，将O(n) 的时间复杂度将为O(1)。
        // 7 使用静态代码块实现赋值静态成员变量
        //对于集合类型的静态成员变量，应该使用静态代码块赋值，而不是使用集合实现来赋值。
        // 8 删除未使用的局部变量、方法参数、私有方法、字段和多余的括号
        // 9 工具类中屏蔽构造函数
        //工具类是一堆静态字段和函数的集合，其不应该被实例化；但是，Java 为每个没有明确定义构造函数的类添加了一个隐式公有构造函数，为了避免不必要的实例化，应该显式定义私有构造函数来屏蔽这个隐式公有构造函数。



    }
}
