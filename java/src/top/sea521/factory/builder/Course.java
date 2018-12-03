package top.sea521.factory.builder;


/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/29 0029 8:32
 */
public class Course {
    private String ppt;
    private String PPT;
    private String video;
    private String QA;

    public String getPpt() {
        return ppt;
    }

    public void setPpt(String ppt) {
        this.ppt = ppt;
    }

    public String getPPT() {
        return PPT;
    }

    public void setPPT(String PPT) {
        this.PPT = PPT;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getQA() {
        return QA;
    }

    public void setQA(String QA) {
        this.QA = QA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "ppt='" + ppt + '\'' +
                ", PPT='" + PPT + '\'' +
                ", video='" + video + '\'' +
                ", QA='" + QA + '\'' +
                '}';
    }
}
