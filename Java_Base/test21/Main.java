package test21;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("E:/Document/PSN/Java_Base/Test.txt");
        
        OutputStream f = new FileOutputStream(file,true);
        String s1 = "123456\n";
        byte b[] = new byte[7];
        b=s1.getBytes();
        f.write(b);
    }
}
