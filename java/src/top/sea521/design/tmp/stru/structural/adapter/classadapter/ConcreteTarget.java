package top.sea521.design.tmp.stru.structural.adapter.classadapter;

/**
 * Created by geely
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
