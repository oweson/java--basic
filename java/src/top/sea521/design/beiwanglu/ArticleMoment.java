package top.sea521.design.beiwanglu;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/9/21 9:08
 */
public class ArticleMoment {
    private String content;
    private String title;
    private String imags;

    public ArticleMoment(String content, String title, String imags) {
        this.content = content;
        this.title = title;
        this.imags = imags;
    }
   // 快照不需要set更改！！！
    public String getContent() {
        return content;
    }



    public String getTitle() {
        return title;
    }



    public String getImags() {
        return imags;
    }



    @Override
    public String toString() {
        return "Article{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", imags='" + imags + '\'' +
                '}';
    }
}
