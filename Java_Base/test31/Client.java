// package test31;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException{
        Socket client = new Socket("localhost", 5050);
        OutputStream cOutputStream = client.getOutputStream();
        
        InputStream fromKeyBoard = System.in;
        byte bFromKeyBoard[] = new byte[65536];
        fromKeyBoard.read(bFromKeyBoard);
        
        cOutputStream.write(bFromKeyBoard);

        InputStream fromStoC = client.getInputStream();
        byte bFromStoC[] = new byte[65536];
        fromStoC.read(bFromStoC);
        System.out.println(new String(bFromStoC));


        client.close();
    }
}
