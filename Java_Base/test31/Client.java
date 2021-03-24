package test31;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException{
        Socket client = new Socket("192.168.0.106", 5050);
        
        OutputStream cOutputStream = client.getOutputStream();
        cOutputStream.write("LYC".getBytes());
        client.close();
    }
}
