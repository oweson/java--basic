package top.sea521.factory.singleton;

import offer.list.HungerManDesign;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/29 0029 14:45
 */
public class Hungry {
    public static final Hungry hugry;

    static {
        hugry = new Hungry();
    }

    public static final Hungry genInstance() {
        return  hugry;
    }
}
