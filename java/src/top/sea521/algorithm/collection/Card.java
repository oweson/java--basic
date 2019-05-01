package top.sea521.algorithm.collection;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/4/30 0030 8:36
 */
public class Card {
    private String ds; // 点数
    private String hs; // 花色
    public Card(String ds, String hs) {
        this.ds = ds;
        this.hs = hs;
    }
    public void showCard() {
        System.out.print(ds + hs+" ");
    }

    public String getDs() {
        return ds;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }
}
