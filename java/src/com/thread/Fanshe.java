package com.thread;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/6/22 0022 22:58
 */
public class Fanshe {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.thread.Fanshe");
        aClass.getClass().getInterfaces();
        System.out.println(aClass);
    }
}
