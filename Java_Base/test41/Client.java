

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends Socket{
    public Client(String H,int P)throws IOException{
        super(H,P);
    }
    public void Write(String aString)throws IOException{
        OutputStream aOutputStream = this.getOutputStream();
        aOutputStream.write(aString.getBytes());
    }
    public String Read() throws IOException{
        InputStream aInputStream = this.getInputStream();
        byte a[] = new byte[65536];
        aInputStream.read(a);
        CCommunicator.toTheScreen(new String(a));
        return (new String(a));
    }
    public static void main(String[] args) throws IOException{
        Client aClient = new Client("localhost", 5050);
        CCommunicator.aClient=aClient;
        new chatGUI();
        while(true){
            System.out.println(aClient.Read());
        }
    }
}
