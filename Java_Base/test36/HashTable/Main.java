package test36.HashTable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer,String> aHashtable = new Hashtable<Integer,String>();
        aHashtable.put(1, "a");
        aHashtable.put(2, "b");
        aHashtable.put(3, "c");
        
        System.out.println(aHashtable);
        System.out.println(aHashtable.entrySet());
        System.out.println(aHashtable.elements());
        System.out.println(aHashtable);
    }
}
