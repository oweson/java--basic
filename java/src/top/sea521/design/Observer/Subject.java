package top.sea521.design.Observer;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/10 21:08
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyAllObservers();
}
