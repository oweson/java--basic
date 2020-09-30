package top.sea521.design.behavioral.templatemethod.v3;

/**
 * Created by geely
 */
public abstract class AbstractCourse {

    protected final void makeCourse() {
        this.makePPT();
        this.makeVideo();
        if (needWriteArticle()) {
            this.writeArticle();
        }
        this.packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    // 1 钩子方法，子类有选择的重写！！！
    protected boolean needWriteArticle() {
        return false;
    }

    // 2 打包课程，每个实现类的打包不同，需要每个具体的类去实现！
    abstract void packageCourse();


}
