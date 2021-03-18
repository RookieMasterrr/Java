package test31;

import java.io.IOException;
import java.io.InputStream;
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
    
    }
}
