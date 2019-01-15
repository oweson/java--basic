package top.mooc.playdataStructure.second.array;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/1/8 0008 12:06
 */
public class Array {
    private int[] data;
    private int size;

    public Array(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    /**
     * 2默认的构造函数，不传入也初始化10；
     */
    public Array() {
        this(10);
    }

    /**
     * 3 查看元素
     */
    private int size() {
        return size;
    }

    /**
     * 4 查看容量
     */
    private int capacity() {
        return data.length;
    }

    /**
     * 5 查看数组是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }
}
