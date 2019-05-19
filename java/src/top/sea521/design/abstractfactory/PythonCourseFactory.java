package top.sea521.design.abstractfactory;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 16:04
 */
public class PythonCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
