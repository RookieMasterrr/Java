package test26;


import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws IOException{
        System.out.println("hello?");        
        OutputStream out = System.out;
        String aString = "ItIsAStringIWillBeWriteInCmd\n";
        byte b[] = aString.getBytes();
        out.write(b);
        out.close();
    }
}
// OutputStream
//      FileOutputStream    FilterOutputStream
//                                  PrintStream