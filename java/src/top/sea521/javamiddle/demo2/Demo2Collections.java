package top.sea521.javamiddle.demo2;

import com.sun.xml.internal.ws.api.pipe.NextAction;
import com.thread.SellTicket;

import java.util.*;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/11/25 0025 10:33
 */
public class Demo2Collections {
    public static void main(String[] args) {
      /*  List list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);

        }
        for (Object o : list) {
            System.out.println(o);

        }*/
        /** 2 了实现了List接口外，LinkedList还实现了双向链表结构Deque，可以很方便的在头尾插入删除数据

         什么是链表结构: 与数组结构相比较，数组结构，就好像是电影院，每个位置都有标示，每个位置之间的间隔都是一样的。 而链表就相当于佛珠，每个珠子，
         只连接前一个和后一个，不用关心除此之外的其他佛珠在哪里*/

        /**对于HashMap而言，key是唯一的，不可以重复的。
         所以，以相同的key 把不同的value插入到 Map中会导致旧元素被覆盖，只留下最后插入的元素。
         不过，同一个对象可以作为值插入到map中，只要对应的key不一样*/
     /*  Map<String,Object> map = new HashMap();
       map.put("a",123);
       map.put("b",123);
       map.put("c",123);
        Set<Map.Entry<String, Object>> entrySet = map.entrySet();
        for (Map.Entry<String, Object> stringObjectEntry : entrySet) {
            System.out.println(stringObjectEntry.getKey()+":"+stringObjectEntry.getValue());

        }
        *//**得到是ky的键值对的集合，这种效率明显比较高*//*
        Iterator<Map.Entry<String, Object>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Object> next = iterator.next();
            System.out.println("key是："+next.getKey()+"value："+next.getValue());
        }*/
        /**Set中的元素，没有顺序。
         严格的说，是没有按照元素的插入顺序排列

         HashSet的具体顺序，既不是按照插入顺序，也不是按照hashcode的顺序。
         关于hashcode有专门的章节讲解:*/
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(9);
        numbers.add(5);
        numbers.add(1);

        // Set中的元素排列，不是按照插入顺序
        /*System.out.println(numbers);
        System.out.println("------------------------------");
        System.out.println(numbers);
        System.out.println("------------------------------");*/

        System.out.println(numbers);
        /**Set不提供get()来获取指定位置的元素
         所以遍历需要用到迭代器，或者增强型for循环*/
       /* for (Integer number : numbers) {
            System.out.println(number);

        }
        System.out.println("------------------------------------------");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }*/
        /**HashSet和HashMap的关系*v/
         *可以发现HashSet自身并没有独立的实现，而是在里面封装了一个Map.
         * HashSet是作为Map的key而存在的
         * 而value是一个命名为PRESENT的static的Object对象，因为是一个类属性，所以只会有一个。
         *
         * private static final Object PRESENT = new Object();
         */
        //有多少重复的字符串
      /*  int flag = 0;
        //放重复的字符串
        List<String> cf = new ArrayList<String>();
        //放入随机生成的100个字符串
        List<String> strlist = new ArrayList<String>();
        String kuString = "0123456789qazwsxedcrfvtgbyhnujmikolpQAZWSXEDCRFVTGBYHNUJMIKOLP";
        Random r = new Random();
        //填充字符串数组
        for (int i = 0; i < 100; i++) {
            char s1 = kuString.charAt(r.nextInt(kuString.length()));
            char s2 = kuString.charAt(r.nextInt(kuString.length()));
            String string = "" + s1 + s2;
            strlist.add(string);
        }
        //进行数组的遍历
        for (int i = 0; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                //有重复字符串
                if (strlist.get(i).equals(strlist.get(j))) {
                    flag++;
                    cf.add(strlist.get(i));
                }
            }*/
        //demo1();

       /* System.out.println("总共有" + flag + "种重复的字符串");
        System.out.println("分别是:");
        for (String s : cf) {
            System.out.print(s + " ");
        }*/
        List list = new ArrayList(100);
        for (int i = 0; i < 10; i++) {
            list.add(i);

        }
        Collections.reverse(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.rotate(list, 2);
        System.out.println(list);
        Collections.sort(list);
        Collections.swap(list, 0, 8);
        System.out.println(list);
        System.out.println("生成数字如下");
        //generator50NumberNoRepeat();
       // generator();
        /**ArrayList: 有顺序
         HashSet: 无顺序;
         不保证Set的迭代顺序; 确切的说，在不同条件下，元素的顺序都有可能不一样



         换句话说，同样是插入0-9到HashSet中， 在JVM的不同版本中，看到的顺序都是不一样的。
         所以在开发的时候，不能依赖于某种臆测的顺序，这个顺序本身是不稳定的;
         能否重复 顶 折 纠 问
         List中的数据可以重复
         Set中的数据不能够重复
         重复判断标准是:
         首先看hashcode是否相同
         如果hashcode不同，则认为是不同数据
         如果hashcode相同，再比较equals，如果equals相同，则是相同数据，否则是不同数据
         更多关系hashcode，请参考hashcode原理;
         */
        /**ArrayList 插入，删除数据慢
         LinkedList， 插入，删除数据快
         ArrayList是顺序结构，所以定位很快，指哪找哪。 就像电影院位置一样，有了电影票，一下就找到位置了。
         LinkedList 是链表结构，就像手里的一串佛珠，要找出第99个佛珠，必须得一个一个的数过去，所以定位慢*/
        /**HashSet： 无序
         LinkedHashSet： 按照插入顺序
         TreeSet： 从小到大排序*/
        /**List查找的低效率 顶 折 纠 问
         假设在List中存放着无重复名称，没有顺序的2000000个Hero
         要把名字叫做“hero 1000000”的对象找出来
         List的做法是对每一个进行挨个遍历，直到找到名字叫做“hero 1000000”的英雄。
         最差的情况下，需要遍历和比较2000000次，才能找到对应的英雄。
         测试逻辑：
         HashMap的性能表现 顶 折 纠 问
         使用HashMap 做同样的查找
         1. 初始化2000000个对象到HashMap中。
         2. 进行10次查询
         3. 统计每一次的查询消耗的时间
         可以观察到，几乎不花时间，花费的时间在1毫秒以内
         */
     /*   List<Fish> total = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            Fish fish = new Fish("hero" + i);
            total.add(fish);

        }
        long start = System.currentTimeMillis();

        for (Fish fish : total) {
            if(fish.getName().equalsIgnoreCase("hero100000")){
                break;
            }

        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);*/
    /* Map<String,Object> map = new HashMap<>();
        for (int i = 0; i < 100000; i++) {
            Fish fish = new Fish("hero" + i);
            map.put(fish.getName(),fish);

        }
        long start = System.currentTimeMillis();
        Object hero100000 = map.get("hero100000");
        System.out.println(hero100000);
        long end = System.currentTimeMillis();
        System.out.println(end-start);*/
        //System.out.println();



    }
    public static void generator(){
        Set<Integer> set  =new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            set.add(random.nextInt(100));

        }
        System.out.println(set.size());

    }
    public static void generator50NumberNoRepeat(){
        Set<Integer> set  =new HashSet<>();
        Random random = new Random();
        while (true){
            int i = random.nextInt(9999);
            set.add(i);
            if(set.size()==50){
                break;
            }
        }
        System.out.println(set.size());
        for (Integer integer : set) {
            System.out.println(integer);

        }
    }


    public static void demo1() {
        List<String> list = new ArrayList<>();
        //放入随机生成的100个字符串
        List<String> strlist = new ArrayList<String>();
        String kuString = "0123456789qazwsxedcrfvtgbyhnujmikolpQAZWSXEDCRFVTGBYHNUJMIKOLP";
        Random r = new Random();
        //填充字符串数组
        for (int i = 0; i < 100; i++) {
            int i1 = r.nextInt(kuString.length());
            int i2 = r.nextInt(kuString.length());
            char c = kuString.charAt(i1);
            char c2 = kuString.charAt(i2);
            String s = c + c2 + "";
            strlist.add(s);


        }
        Set<String> set = new HashSet<>();
        boolean b = set.addAll(strlist);
        System.out.println(strlist.size() + "-----" + set.size());
        for (String s : set) {


        }

    }
}
