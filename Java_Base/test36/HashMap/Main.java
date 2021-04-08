package test36.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> aHashMap = new HashMap<Integer,String>();
        aHashMap.put(1, "a");
        aHashMap.put(2, "b");
        aHashMap.put(3, "c");
        aHashMap.put(4, "d");
        System.out.println(aHashMap);
        System.out.println(aHashMap.keySet());
        System.out.println(aHashMap.values());
        // 键值对的集合
        System.out.println();
        System.out.println(aHashMap.get(1));
        System.out.println(aHashMap.get(2));
        // 通过key获得value
        System.out.println();
        System.out.println(aHashMap.containsKey(1));
        System.out.println(aHashMap.containsKey(2));
        // 判断key是否存在
        System.out.println();
        System.out.println(aHashMap.containsValue("a"));
        System.out.println(aHashMap.containsValue("b"));
        // 判断value是否存在
        
        System.out.println();
        
        for(int i:aHashMap.keySet()){
            System.out.println(aHashMap.get(i));
        }
        // 遍历HashMap的方法
        System.out.println();

        for(int i:aHashMap.keySet()){
            aHashMap.compute(i, (key,value)->value+"1");
        }
        // 匿名函数方法
        System.out.println(aHashMap);        
        System.out.println();
        
        System.out.println(aHashMap.entrySet());
    }
}
