package test26;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Main3 {
    public static void main(String[] args) throws IOException{
        PrintStream p = new PrintStream(System.out,true);
        // Object object = new Object();
        p.print("hello\n");


        // 只有fileoutputstream可以设置追加 
        PrintStream p2 = new PrintStream(new File("test4.txt"));
        p2.print("hello\n");
    }
}
