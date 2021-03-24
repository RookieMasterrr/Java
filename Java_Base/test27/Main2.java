package test27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


// FILE INPUT
public class Main2 {
    public static void main(String[] args) throws IOException{
        File file = new File("test.txt");
        InputStream in = new FileInputStream(file);
        
        

        // 1 
        byte []b = new byte[10];
        in.read(b);
        System.out.println(new String(b));


        // 2
        FileReader fileReader = new FileReader(file);
        char []c1 = new char[10];
        fileReader.read(c1);
        System.out.println(c1);

        // 3 read方法一般都会读完就下一个，所以这里的read就读不出来,read仅当遇到文件结束符时返回-1
        InputStreamReader inputStreamReader = new InputStreamReader(in);
        char []c2 = new char[10];
        inputStreamReader.read(c2);
        System.out.println(c2);


// InputStreamReader
//      FileReader
    }   
}