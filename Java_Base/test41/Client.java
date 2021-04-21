// package test41;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends Socket{
    public Client(String host, int port) throws IOException{
        super(host,port);
    }
    public static void main(String[] args) throws IOException{
        Client aClient = new Client("localhost", 5050);
        
        // OutputStream aOutputStream = aClient.getOutputStream();
        // aOutputStream.write("Its Client".getBytes());

    }
}
