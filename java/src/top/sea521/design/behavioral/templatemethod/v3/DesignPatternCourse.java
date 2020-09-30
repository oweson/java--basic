package top.sea521.design.behavioral.templatemethod.v3;

/**
 * Created by geely
 */
public class DesignPatternCourse extends AbstractCourse {
    // 隐含的继承下来了！！！this就是这里的对象！！！
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }

}
