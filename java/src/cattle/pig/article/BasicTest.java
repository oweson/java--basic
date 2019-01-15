package cattle.pig.article;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/6 0006 16:31
 */
public class BasicTest {
    /** 1 在 JAVA 编程中， Java 编译器会将 Java 程序转换为（ ）

     正确答案: A   你的答案: A
     字节码
     可执行代码
     机器代码
     以上都不对;

     解析：
     编译器将Java源代码编译成字节码class文件
     类加载到JVM里面后，执行引擎把字节码转为可执行代码
     执行的过程，再把可执行代码转为机器码，由底层的操作系统完成执行。
     */
    /** 1 下列方法定义中 ， 正确 的是 （）

     正确答案: A   你的答案: A
     int x( ){ char ch=’a’; return (int)ch; }
     void x( ){ ...return true; }
     int x( ){ ...return true; }
     int x( int a, b){ return a+b; }

     解析：
     A.Java中涉及到byte、short和char类型都可以强制转化为int，符合返回类型 A正确
     B.方法中定义为void 应该没有返回值，但返回值为boolean类型 B错
     C. 方法中类型为int，应该返回int类型值，但是 返回值为boolean类型 C错
     D.方法应该定义为int(int a,int b)，所以D错；

     */

    /**三：
     * 现在明白了如果一个类声明为protected，它的子类是可以访问它的，如果它和子类不在一个包中，
     * 子类仍然可以访问该类，所以这里选择default，即什么都不写*/
    /**四：一个以”.java”为后缀的源文件

     正确答案: C   你的答案: C
     只能包含一个类，类名必须与文件名相同
     只能包含与文件名相同的类以及其中的内部类
     只能有一个与文件名相同的类，可以包含其他类
     可以包含任意类；
     */
    /** 4 方法通常存储在进程中的哪一区（）

     正确答案: D   你的答案: D
     堆区
     栈区
     全局区
     方法区
     解析：
     Java运行时的数据区包括：（其中前两个是线程共享的）
     1.方法区（Method Area） 存储已被虚拟机加载的类信息、常量、静态变量、即时编译器编译后的代码等数据
     2.堆（Heap） 存放对象实例，几乎所有对象实例都在这里分配内存
     3.虚拟机栈（VM Stack） 描述的是Java方法执行的内存模型：每个方法在执行的同时会创建一个Stack Frame（方法运行时的基础数据结构）用于存储局部变量表、操作数栈、动态连接、方法出口等信息
     4.本地方法栈（Native Method Stack）  与虚拟机栈了类似，不过则为虚拟机使用的到的Native方法服务。（有的虚拟机譬如Sun HotSpot虚拟机直接把本地方法栈和虚拟机栈合二为一）
     5.程序计数器（Program Counter Register） 可看作当前线程所执行的字节码的行号的标识器
     */
}
