package test33;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        
        ArrayList<Integer> bArrayList = (ArrayList<Integer>) arrayList.clone();

        ArrayList<Integer> cArrayList = (ArrayList<Integer>) bArrayList.clone();

        // String aString = new String("123");
        // aString.clone();

        // System.out.println(arrayList.hashCode());
        // System.out.println(bArrayList.hashCode());
        // bArrayList.clear();
        // System.out.println(bArrayList.hashCode());
        // System.out.println(cArrayList.hashCode());

        // System.out.println(bArrayList);

        // (bArrayList).clear();

        // System.out.println(bArrayList);

        // System.out.println(arrayList);
        // System.out.println(bArrayList.equals(arrayList));

        // System.out.println((bArrayList)==arrayList);

        // A firstA = new A(new Integer(1));

        // System.out.println(firstA==firstA.clone());

        int a = 1;
        int b = 1;
        System.out.println(a==b);

    }
}

class A implements Cloneable{
    Integer a;

    A(Integer aa) {
        a=aa;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
