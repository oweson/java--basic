package pig.dog.offer.question.jiuyuankeji;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/7/18 21:01
 */
public class Demo4Refrence {
    String name;

    public Demo4Refrence(String name) {
        this.name = name;
    }

    public static void change(Demo4Refrence myfoo) {
        System.out.println("change input myfoo.name: " + myfoo.name);

        myfoo.name = "FiFi";
        System.out.println("change new   myfoo.name: " + myfoo.name);
    }
    public static  void intTest(){
        /**Integer 是引用类型吗？传递给 change 方法的参数修改后会影响外部吗？
         Integer 创建出来的是一个对象（自动装箱），所以是引用类型
         不会影响到外部
         第二个问题为什么就不会影响到外部呢？原因是这样的，
         Integer 这个类（还有 String、Double、Long等）比较特殊，
         它是 final 的，是不可变的。当我们使用 num = 2333; 这行代码去赋值的时候发生了什么？

         这里我就不画图描述了，这行代码意味着给 num 又创建一个新的对象，所以方法内的 num 引用类型指向了 2333 所处的内存。当我们使用 = 进行操作时候修改的是引用，而不是一个单纯的赋值操作，相当于前面例子中的 myfoo = new Foo("biezhi")。
         如果你想实现 Integer 数值的修改可以试试 AtomicInteger 这个类。*/
    }
    public static void main(String[] args) {
        /**对于 change 方法接收到的 name 是 Jerry 我们可以理解，修改后方法内输出的 FiFi 也可以理解，
         * 因为在同一函数体内，变量的修改必然是可见的。需要解释的就是外部的修改也会发生变化，这是为啥呢？
         *
         * 结论：对于引用类型，是通过传值的方式传引用（引用类型）。这句话可能会有点儿绕，不要死记硬背它。*/
        Demo4Refrence foo = new Demo4Refrence("Jerry");
        change(foo);

        System.out.println(foo.name);
    }
}
