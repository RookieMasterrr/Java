package test23;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        URL u1 = new URL("https://www.runoob.com/try/ajax/json_demo.txt");
        // System.out.println(u1);
        // System.out.println(u1.getAuthority());
        // System.out.println(u1.getContent());
        // System.out.println(u1.getHost());
        // System.out.println(u1.equals(u1));
        InputStream uInputStream =  u1.openStream();
        byte []b = new byte[65536];
        uInputStream.read(b);
        System.out.println(new String(b));
    }
}
