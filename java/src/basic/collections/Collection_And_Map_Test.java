package basic.collections;

import java.util.*;
import java.util.Map.Entry;

/**
 * @author 作者程万里 E-mail1273919421@:
 * @version 创建时间：2018年5月10日 下午7:03:24
 * 类说明：侵权必究。。。。。。。
 */

public class Collection_And_Map_Test {
    public static void main(String[] args) {
        /** 1 ArrayList集合方法的使用*/
        ArrayList<Student> arraylist = new ArrayList<Student>();
        Student stu1 = new Student("01", 21, "曹植培");
        Student stu2 = new Student("02", 20, "傅金帅");
        Student stu3 = new Student("03", 17, "冯唐涛");
        arraylist.add(stu1);
        arraylist.add(stu2);
        arraylist.add(stu3);
        
        /** 2 for(xxx tmp:list){ ....}方法的遍历*/
        for (Student s : arraylist) {
            System.out.println(s.getNumber() + " " + s.getAge() + " " + s.getName());
        }
        System.out.println("------------------------------------------------------------");
        /** 3 for(int i=0;i<list.size();i++){XXX tmp = list.get(i)方法的遍历*/
        for (int i = 0; i < arraylist.size(); i++) {
            System.out.println(arraylist.get(i));
        }
        System.out.println("------------------------------------------------------------1");
        System.out.println("------------------------------------------------------------1");


        /** 4 LinkedList集合方法的使用*/
        LinkedList<Student> linkedlist = new LinkedList<Student>();
        linkedlist.add(stu1);
        linkedlist.add(stu2);
        linkedlist.add(stu3);
        /**for(xxx tmp:list){ ....}方法的遍历*/
        for (Student s : linkedlist) {
            System.out.println("学号 =" + s.getNumber() + "年龄=" + s.getAge() + "姓名=" + s.getName());
        }
        System.out.println("------------------------------------------------------------");
        /**for(int i=0;i<list.size();i++){XXX tmp = list.get(i)方法的遍历*/
        for (int i = 0; i < linkedlist.size(); i++) {
            System.out.println(linkedlist.get(i));
        }
        System.out.println("------------------------------------------------------------2");
        System.out.println("------------------------------------------------------------2");


        //HashSet集合方法的使用
        HashSet<Student> hashset = new HashSet<Student>();
        hashset.add(stu1);
        hashset.add(stu2);
        hashset.add(stu3);
        //for(xxx tmp:list){ ....}方法的遍历
        for (Student s : hashset) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------------3");
        System.out.println("------------------------------------------------------------3");


        //LinkedHashSet集合方法的使用
        LinkedHashSet<Student> linkedhashset = new LinkedHashSet<Student>();
        linkedhashset.add(stu1);
        linkedhashset.add(stu2);
        linkedhashset.add(stu3);
        //for(xxx tmp:list){ ....}方法的遍历
        for (Student s : linkedhashset) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------------------------4");
        System.out.println("------------------------------------------------------------4");


        //HashMap集合方法的使用
        HashMap<String, Student> hashmap = new HashMap<String, Student>();
        hashmap.put(stu1.getNumber(), stu1);
        hashmap.put(stu2.getNumber(), stu2);
        hashmap.put(stu3.getNumber(), stu3);
        Set<Entry<String, Student>> entrySet = hashmap.entrySet();
        //for(xxx tmp:list){ ....}方法的遍历
        for (Entry<String, Student> s : entrySet) {
            String key = s.getKey();
            Student value = s.getValue();
            System.out.println("key=" + key + "value=" + value);
        }
        System.out.println("------------------------------------------------------------5");
        System.out.println("------------------------------------------------------------5");


        //LinkedHashMap集合方法的使用1
        LinkedHashMap<String, Student> linkedhashmap = new LinkedHashMap<String, Student>();
        linkedhashmap.put(stu1.getNumber(), stu1);
        linkedhashmap.put(stu2.getNumber(), stu2);
        linkedhashmap.put(stu3.getNumber(), stu3);
        Set<Entry<String, Student>> entrySet2 = linkedhashmap.entrySet();
        //for(xxx tmp:list){ ....}方法的遍历
        for (Entry<String, Student> s : entrySet2) {
            String key = s.getKey();
            Student value = s.getValue();
            System.out.println("key==" + key + "value==" + value);
        }
        System.out.println("------------------------------------------------------------");

        //LinkedHashMap集合方法的使用2
        LinkedHashMap<String, String> linkedhashmap2 = new LinkedHashMap<String, String>();
        linkedhashmap2.put("郭靖", "黄蓉");
        linkedhashmap2.put("尹志平", "黄蓉");
        linkedhashmap2.put("尹志平", "姑姑");//key键值相同，value值的覆盖
        linkedhashmap2.put("杨过", "小龙女");
        Set<Entry<String, String>> entrySet3 = linkedhashmap2.entrySet();
        //for(xxx tmp:list){ ....}方法的遍历
        for (Entry<String, String> s : entrySet3) {
            String key = s.getKey();
            String value = s.getValue();
            System.out.println("key===" + key + "value===" + value);
        }
        System.out.println("------------------------------------------------------------");

        Set<String> entrySet4 = linkedhashmap2.keySet();
        //keySet()方法遍历
        for (String key : entrySet4) {
            String value = linkedhashmap2.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println("------------------------------------------------------------6");
        System.out.println("------------------------------------------------------------6");
    }


}
