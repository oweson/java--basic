package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/5 0005 18:09
 */
public class CollectionTest {
    /**1 题目：
     * Java中的集合类包括ArrayList、LinkedList、HashMap等，下列关于集合类描述错误的是？
     * 正确答案: C   你的答案: C
     * ArrayList和LinkedList均实现了List接口
     * ArrayList的访问速度比LinkedList快
     * 随机添加和删除元素时，ArrayList的表现更佳
     * HashMap实现Map接口，它允许任何类型的键和值对象
     *
     * answer:
     *
     * 1 collection接口下面有两个小弟，分别list和set接口。list是有序的，
     * 而set是无序的，然后list又收了arraylist和LinkedList当小弟， arraylist线程不同步，底层是数组结构，查询快，为什么？因为你想想我直接读角标就可以了，增删的时候，角标要变化，
     * 所以速度比较慢，LinkedList底层是链表结构增删快，查询慢。
     *
     * 2 “HashMap实现Map接口，它允许任何类型的键对象” 这句话是有前提条件的。
     * 这需要查看HashMap底层源码，在计算hashcode的过程中会用到equals（）和hashCode（）这两个函数；
     * 所以键的对象类型必须遵守这两个函数的规则，保证键的不变性，即：
     * 1.若两对象equals，则它两hashcode一定相等；
     * 2.若两对象不equals，则它两hashcode有可能相等；
     * 3.若两对象hashcode相等，则它两不一定equals；
     * 4.若两对象hashcode不相等，则它两一定 不equals；
     * 举个栗子：String类，Integer类，Wrapper类，都满足如上的规则。那是Java给我们实现好了的
     *
     * 3 ArrayList和LinkedList都实现List接口，Hashset实现Set接口
     *
     * BC.Arraylist在内存中顺序排放，可以通过为止找到地址查找快，增加删除需要修改其后面的所以元素所以慢。LinkedList在内存中链表存放，查找慢，修改快
     *
     * D.HashMap运行任何键值对。即使是null也是支持的*/


    /** 2 以下关于集合类 ArrayList 、 LinkedList 、 HashMap 描述错误的是：

     正确答案: C   你的答案: C
     HashMap实现Map接口，它允许任何类型的键和值对象，并允许将null用作键或值
     ArrayList和LinkedList均实现了List接口
     添加和删除元素时，ArrayList的表现更佳
     ArrayList的访问速度比LinkedList快

     解析：Hashtable不允许 null 值(key 和 value 都不可以)，
     HashMap允许 null 值(key和value都可以)。
     ArrayList和LinkedList均实现了List接口
     ArrayList基于数组实现，随机访问更快
     LinkedList基于链表实现，添加和删除更快*/
    /** 3 列表（List）的元素是有 序、可重复 的；
     集合（Set）的元素是无序、不可重复的。*/

}
