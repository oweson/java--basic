package top.sea521.design.tmp.stru.structural.adapter.classadapter;

/**
 * Created by geely
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
