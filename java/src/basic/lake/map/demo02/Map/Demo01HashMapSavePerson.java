package basic.lake.map.demo02.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
    HashMap存储自定义类型键值
    Map集合保证key是唯一的:
        作为key的元素,必须重写hashCode方法和equals方法,以保证key唯一
 string可以作为key,他不变
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    /**
        HashMap存储自定义类型键值
        key:Person类型
            Person类就必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型
            可以重复；
     1、可以 但是做为key的数据有如下要求：
     2、首先，要求明确一点Map集合存储数据的主要目的是为了查找  而List集合是为了输出
     3、既然是查找那么就要涉及到对象比较 我们说了如果要进行对象比较就必须覆写Object类中的equals()、hasCode() 至少覆写equals()方法  简单理解：自己定义的类如果要想实现对象比较就必须至少覆写equals()方法
     4、或则这么说只要是自己定义的类要想将其作为key 就必须覆写equals()方法
     5、实际工作中 key的类型一定是String型 (95%通用) 其余的5%是没事找事的
     6、按标准开发、你会感到事半功倍，不要没事给自己找事，当然求知精神是值得肯定的。
     */
    private static void show02() {
        //创建HashMap集合
        HashMap<Person,String> map = new HashMap<>();
        //往集合中添加元素
        map.put(new Person("女王",18),"英国");
        map.put(new Person("秦始皇",18),"秦国");
        map.put(new Person("普京",30),"俄罗斯");
        map.put(new Person("女王",18),"毛里求斯");
        //使用entrySet和增强for遍历Map集合

        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }

    }

    /**
        HashMap存储自定义类型键值
        key:String类型
            String类重写hashCode方法和equals方法,可以保证key唯一
        value:Person类型
            value可以重复(同名同年龄的人视为同一个)
     */
    private static void show01() {
        //创建HashMap集合
        HashMap<String,Person> map = new HashMap<>();
        //往集合中添加元素
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",19));
        map.put("广州",new Person("王五",20));
        map.put("北京",new Person("赵六",18));
        //使用keySet加增强for遍历Map集合
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+"-->"+value);
        }
    }
}
