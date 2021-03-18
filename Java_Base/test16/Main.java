package test16;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        // String s = br.readLine();
        // System.out.println(s);

        // int c = System.in.read();
        // System.out.println(c);
    
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();//可以读取空格
        String b = sc.next();//不能读取空格
        System.out.println(a);
        System.out.println(b);
        // System.out.println(a.getClass());
        sc.close();
    }           
}