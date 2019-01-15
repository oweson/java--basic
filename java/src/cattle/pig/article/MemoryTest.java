package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 15:16
 */
public class MemoryTest {
    /** 1 java中关于内存回收的正确说法是

     正确答案: B   你的答案: B
     程序员必须创建一个线程来释放内存
     内存回收程序负责释放无用内存
     内存回收程序允许程序员直接释放内存
     内存回收程序可以在指定的时间释放内存对象

     解析：java的GC回收是完全自动的，没有提供相关api手动回收，
     所有的内存分配和回收权限都在jvm，
     在开发人员手里没有绝对的强制垃圾回收的方法，不过可以这样去做：
     1. 对于不再引用的对象，及时把它的引用赋为null。 obj = null;
     2. 如果内存确实很紧张，调用System.gc() 方法来建议垃圾回收器开始回收垃圾，
     通知GC运行，但是Java语言规范并不保证GC一定会执行。*/
}
