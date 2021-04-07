package test36.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> aIntegers = new LinkedList<Integer>();
        aIntegers.add(1);
        aIntegers.add(2);
        aIntegers.add(3);
        System.out.println(aIntegers);
        System.out.println(aIntegers.removeLast());
        System.out.println(aIntegers.removeFirst());
        System.out.println(aIntegers);
    }
}