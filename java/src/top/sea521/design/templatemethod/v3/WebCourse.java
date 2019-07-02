package top.sea521.design.templatemethod.v3;

/**
 * Created by geely
 */
public class WebCourse extends AbstractCourse {
    // 1 默认值
    private boolean needWriteArticleFlag = false;

    @Override
    void packageCourse() {
        System.out.println("提供课程的前端代码");
        System.out.println("提供课程的图片等多媒体素材");
    }

    /**
     * 2 通过有参数的构造，改变布尔的默认值；
     */
    public WebCourse(boolean needWriteArticleFlag) {
        this.needWriteArticleFlag = needWriteArticleFlag;
    }

    /**
     * 3 布尔标识符号设置
     */
    @Override
    protected boolean needWriteArticle() {
        return needWriteArticleFlag;
    }
}
