package basic.lake.collection.demo01.List;

import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/8/30 7:27
 */
public class Demo12NPE {
    public static final Integer demo1() {
        return 0;
    }

    public static final List<Integer> demo2() {
        List<Integer> list = new ArrayList<>();
        return list;
    }

    public static void main(String[] args) {
        Integer integer = demo1();
        System.out.println(integer.floatValue());
        System.out.println(integer.longValue());
        if (demo2().isEmpty()) {
            System.out.println("empty");
        }
        if (demo2() == null) {
            System.out.println("null");
        }
        Integer integer1 = null;
        try {
            integer1 = demo2().get(1);
        } catch (Exception e) {
            // 捕捉以后不处理
            System.out.println("error");
        }
        if (integer1 == null) {
            System.out.println(100000);
        }
        // 集合的size不确定，查找有可能NPE
        System.out.println(demo2().get(1));

    }
}
