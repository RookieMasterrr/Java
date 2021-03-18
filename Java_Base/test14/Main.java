package test14;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Array
        //创建方法
        int a[] = new int [10];
        for(int i=0; i<10; i++){
            a[i]=i;
        }
        // for(int i=0; i<10; i++){
        //     System.out.println(a[i]);
        // }
        // for(int x:a){
        //     System.out.println(x);
        // }                

        // Array static methods 一般是对数组的操作
        System.out.println(Array.getLength(a));
        
        System.out.println(Array.get(a, 9));//返回值
        
        Array.set(a, 9, 999);//获得值
        for(int i=0; i<10; i++){
            System.out.println(a[i]);
        }

        // Arrays static methods 一般是对数据进行查询啊，排序啊一些额外的操作
        System.out.println(Arrays.binarySearch(a, 999));
    }
}
