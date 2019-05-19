package top.sea521.design.abstractfactory;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/27 0027 16:09
 */
public class Test {
    public static void main(String[] args) {
        //fixme
        //xxx
        CourseFactory courseFactory =new JavaCourceFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
