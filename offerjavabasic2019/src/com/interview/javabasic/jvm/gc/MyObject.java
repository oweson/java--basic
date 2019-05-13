package com.interview.javabasic.jvm.gc;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class MyObject {
    public MyObject childNode;

    public static void main(String[] args) {
        Object object = new Object();
        // 弱化引用，等待回收！
        object=null;
        System.out.println(object);
        SoftReference<String> softReference = new SoftReference<String>("abc");
        WeakReference<Integer> weakReference = new WeakReference<>(100);


    }
}
