// package test31;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket server = new ServerSocket(5050);
        Socket client = server.accept();
        InputStream cInputStream = client.getInputStream();
        byte b[] = new byte[65536];
        
        cInputStream.read(b);
        System.out.println(new String(b)); 
    
        InputStream fromKeyBoard = System.in;
        byte bFromKeyBoard[] = new byte[65536];
        fromKeyBoard.read(bFromKeyBoard);
        OutputStream fromStoC = client.getOutputStream();
        fromStoC.write(bFromKeyBoard);

        server.close();
    }
}
