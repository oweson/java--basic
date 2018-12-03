package top.sea521.factory.abstractfactory;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 15:58
 */
public class JavaCourceFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
