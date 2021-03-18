package test30;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException{
        String string = "哈哈cdef";
        System.out.println(string.length());
        byte []b = string.getBytes("unicode");
        System.out.println(b.length);
    }
    
}
