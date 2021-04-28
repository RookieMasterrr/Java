// package test31;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException{
        Socket client = new Socket("192.168.0.106", 5050);
        OutputStream sFromClient = client.getOutputStream();
        
        int thePortIWantToChat = 1001;

        String localSocketString;
        localSocketString = client.getLocalSocketAddress().toString().replace("/", "");
        String ipAddress = localSocketString.substring(0, localSocketString.indexOf(":")); 
        

        String chatInfo = ipAddress+":"+thePortIWantToChat;

        sFromClient.write(chatInfo.getBytes());



        client.close();
    }
}
