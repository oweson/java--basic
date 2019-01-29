package eclipse.mar.other;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/20 0020 19:24
 */
public class Demo14Generic {
    public static void main(String[] args) {
        /** 1 使用泛型的好处：
         泛型的用法是在容器后面添加<Type>
         Type可以是类，抽象类，接口
         泛型表示这种容器，只能存放APHero，ADHero就放不进去了。*/
        /** 2 子类对象 顶 折 纠 问
         假设容器的泛型是Hero,那么Hero的子类APHero,ADHero都可以放进去
         和Hero无关的类型Item还是放不进去*/
        /**  3 设计一个支持泛型的栈MyStack
         设计这个类的时候，在类的声明上，加上一个<T>，表示该类支持泛型。
         T是type的缩写，也可以使用任何其他的合法的变量，比如A,B,X都可以，但是一般约定成俗使用T，代表类型。*/
        /** 4 ArrayList heroList<? extends Hero> 表示这是一个Hero泛型或者其子类泛型
         heroList 的泛型可能是Hero
         heroList 的泛型可能是APHero
         heroList 的泛型可能是ADHero
         所以 可以确凿的是，从heroList取出来的对象，一定是可以转型成Hero的

         但是，不能往里面放东西，因为
         放APHero就不满足<ADHero>
         放ADHero又不满足<APHero>*/
        /** 5 ArrayList heroList<? super Hero> 表示这是一个Hero泛型或者其父类泛型
         heroList的泛型可能是Hero
         heroList的泛型可能是Object

         可以往里面插入Hero以及Hero的子类
         但是取出来有风险，因为不确定取出来是Hero还是Object*/
        /** 6 型通配符? 代表任意泛型
         既然?代表任意泛型，那么换句话说，这个容器什么泛型都有可能

         所以只能以Object的形式取出来
         并且不能往里面放对象，因为不知道到底是一个什么泛型的容器*/
        /**7 如果希望只取出，不插入，就使用? extends Hero
         如果希望只插入，不取出，就使用? super Hero
         如果希望，又能插入，又能取出，就不要用通配符？*/
        /** 8 子类转父类 是一定可以成功的;v子类泛型不可以转换为父类泛型*/

    }
}
