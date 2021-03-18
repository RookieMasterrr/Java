package test26;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main2 {
    public static void main(String[] args) throws IOException{
        OutputStream out = new FileOutputStream("test",true);
        String aString = "ItIsAStringIWillBeWriteInFile";
        byte []b = aString.getBytes();
        out.write(b);
        out.flush();
        out.close();
    }
}
