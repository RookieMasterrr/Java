package test27;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException{
        InputStream in = System.in;
        
        byte b[] = new byte[10];
        in.read(b);
        
        System.out.println(b);

        for(int i:b){
            System.out.print(i);
        }
        System.out.println();

        
        
    }
}
