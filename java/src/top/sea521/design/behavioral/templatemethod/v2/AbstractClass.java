package top.sea521.design.behavioral.templatemethod.v2;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 17:12
 */
public abstract class AbstractClass {
    protected boolean isNeedUnlock = true;
    // 默认需要开锁

    /**
     * 1 基本方法，子类需要实现
     */
    protected abstract void unlock();

    /**
     * 2 基本方法，子类需要实现
     */
    protected abstract void ride();

    /**
     * 3 钩子方法，子类可实现
     *
     * @param isNeedUnlock
     */
    protected void isNeedUnlock(boolean isNeedUnlock) {
        this.isNeedUnlock = isNeedUnlock;
    }

    /**
     * 4 模板方法，负责调度基本方法，子类不可实现
     */
    public final void use() {
        if (isNeedUnlock) {
            unlock();
        } else {
            System.out.println("========锁坏了，不用解锁========");
        }
        ride();
    }
}
