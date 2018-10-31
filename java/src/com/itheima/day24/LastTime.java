package com.itheima.day24;

import java.util.Objects;

/**
 * @Author:oweson
 * @Date :2018/5/27 0027 21:46
 * @色厉而胆薄，好谋而寡断
 */

public class LastTime {
    int name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LastTime lastTime = (LastTime) o;
        return name == lastTime.name;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    public LastTime(int name) {
        this.name = name;
    }

    public static void main(String[] args) throws  InterruptedException{
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println(i);


        }
    }
}
