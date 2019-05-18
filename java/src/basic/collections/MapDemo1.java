package basic.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void demo1() {
        Map<String, String> map = new HashMap<String, String>(10000);
        map.put("a", "ppx");
        map.put("b", "tomcat");
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next + map.get(next));
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Math.sin(Math.PI / 6));
        //30接近二分之一
        demo1();
        //this is main fun;
        Map<String, String> map = new HashMap<String, String>(10000);
        map.put("a", "ppx");
        map.put("b", "tomcat");
        System.out.println("--------------------------------");
        map.forEach((k,v)->{System.out.print(k+":"+v);});





    }

}
