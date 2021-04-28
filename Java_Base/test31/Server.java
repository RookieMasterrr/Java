// package test31;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException{
        ServerSocket server = new ServerSocket(5050);
        while(true){
            Socket client = server.accept();
            InputStream sFromClient = client.getInputStream();
            byte bFromClient [] = new byte[65536];
            
            sFromClient.read(bFromClient );
            System.out.println(new String(bFromClient )); 
        }
    }
}
