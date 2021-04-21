// package test41;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends ServerSocket{
    public Server(int port) throws IOException{
        super(port);
    }
    public static void main(String[] args) throws IOException {
        Server aServer = new Server(5050);
        while(true){
            Socket aSocket = aServer.accept();
            System.out.println(aSocket.getPort());
        }
    }
}
