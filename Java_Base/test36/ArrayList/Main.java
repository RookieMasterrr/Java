package test36.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> bArrayList = new ArrayList<Integer>();
        bArrayList.add(1);
        bArrayList.add(2);
        bArrayList.add(3);
        bArrayList.add(1);
        System.out.println(bArrayList.toString());
// 使用迭代器遍历这个ArrayList,先append一个[最后再来一个],返回这个String


        // bArrayList.trimToSize();
// ArrayList底层是一个数组，当size要大于capacity时会开一个新的数组，大小是不一定1.5倍，所以难免有浪费，使用trim可以避免浪费，使capacity=size
// int new = max(preferred,min)+old preferred是0.5*old才是1.5 所以不一定是1.5


        // bArrayList.ensureCapacity(2);
// 设定一个最小capacity,如果参数都小于size,则会直接不执行


        // System.out.println(bArrayList.contains(1));
        // System.out.println(bArrayList.indexOf(1));
//      indexof,调用indexOfRange,拷贝数组然后从头遍历到找到就返回,用equals判断


        // System.out.println(bArrayList.lastIndexOf(1));
//      类似indexOfRange只是从后遍历
        

        // ArrayList<Integer> aArrayList = new ArrayList<Integer>();
        // bArrayList.forEach((e)->{e=e*10;aArrayList.add(e);});
        // System.out.println(bArrayList.toString());
//      使用foreach来遍历每一个数组


        // ArrayList<Integer> aArrayList = new ArrayList<Integer>();
        // aArrayList.add(1);
        // bArrayList.retainAll(aArrayList);
        // System.out.println(bArrayList);
//      retain,保留


        // ListIterator<Integer> aIterator = bArrayList.listIterator();
        // System.out.println(aIterator.next());
        // System.out.println(aIterator.next());
        // System.out.println(aIterator.previous());
//      迭代器
    }
}