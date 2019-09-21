package top.sea521.design.beiwanglu;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/9/21 9:05
 */
public class Article {
    private String content;
    private String title;
    private String imags;

    public Article(String content, String title, String imags) {
        this.content = content;
        this.title = title;
        this.imags = imags;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImags() {
        return imags;
    }

    public void setImags(String imags) {
        this.imags = imags;
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
