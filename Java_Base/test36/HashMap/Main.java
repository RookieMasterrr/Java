package test36.HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> aHashMap = new HashMap<Integer,String>();
        // System.out.println(aHashMap.size());
        aHashMap.put(1, "a");
        aHashMap.put(2, "b");
        System.out.println(aHashMap);
        System.out.println(aHashMap.keySet());
        System.out.println(aHashMap.values());
    }
}
