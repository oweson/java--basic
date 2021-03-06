package top.sea521.design.creational.singleton;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by geely
 */
public class Demo6ContainerSingleton {

    private Demo6ContainerSingleton(){

    }
    private static Map<String,Object> singletonMap = new HashMap<String,Object>();

    public static void putInstance(String key,Object instance){
        if(key!="" && instance != null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }


}
