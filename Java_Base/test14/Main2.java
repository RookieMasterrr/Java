package test14;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int a[] = {6,5,4,3,2,1};
        Arrays.sort(a, 0, 6);
        for(int i:a){
            System.out.println(i);
        }
    }
}