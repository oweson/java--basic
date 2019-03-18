package top.sea521.javamiddle.demo2;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/20 0020 18:10
 */
public class Demo1Collection {
    public static void main(String[] args) {
        /** 1 引入容器类的概念。 最常见的容器类就是
         ArrayList
         容器的容量"capacity"会随着对象的增加，自动增长
         只需要不断往容器里增加英雄即可，不用担心会出现数组的边界问题。*/
        /** 2 toArray	转换为数组;
         * set	替换	示例代码
         * size	获取大小	示例代码
         * toArray	转换为数组	示例代码
         * addAll	把另一个容器所有对象都加进来	示例代码
         * clear	清空
         * */
        /** 3 ArrayList实现了接口List
         常见的写法会把引用声明为接口List类型*/

        /** 4 因为ArrayList实现了List接口，所以List接口的方法ArrayList都实现了。*/
        /** 5 不过JDK7提供了一个可以略微减少代码量的泛型简写方式

         List<Hero> genericheros2 = new ArrayList<>();


         后面的泛型可以用<>来代替，聊胜于无吧*/
        /** 6 用增强型for循环可以非常方便的遍历ArrayList中的元素，这是很多开发人员的首选。
         不过增强型for循环也有不足：
         无法用来进行ArrayList的初始化
         无法得知当前是第几个元素了，当需要只打印单数元素的时候，就做不到了。 必须再自定下标变量。*/
        /** 7 除了实现了List接口外，LinkedList还实现了双向链表结构Deque，可以很方便的在头尾插入删除数据

         什么是链表结构: 与数组结构相比较，数组结构，就好像是电影院，每个位置都有标示，每个位置之间的间隔都是一样的。 而链表就相当于佛珠，每个珠子，
         只连接前一个和后一个，不用关心除此之外的其他佛珠在哪里。
         inkedList 除了实现了List和Deque外，还实现了Queue接口(队列)。
         Queue是先进先出队列 FIFO，常用方法：
         offer 在最后添加元素
         poll 取出第一个元素
         peek 查看第一个元素*/
    }
}
