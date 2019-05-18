package basic.innerclass;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/5/12 0012 1:10
 */
public class Fly implements Bird {
    // 说明java接口的继承是多继承的机制;（1）通过接口可以实现不相关类的相同行为，而不需要了解对象所对应的类。
    //
    //　　 （2）通过接口可以指明多个类需要实现的方法。
    //
    //　　 （3）通过接口可以了解对象的交互界面，而不需了解对象所对应的类。
    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }
}
