
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends ServerSocket{
    public static Server  aServer;
    public Server(int P)throws IOException{
        super(P);
    }
    static public String Read(Socket aSocket)throws IOException{
        byte a[] = new byte[65536];
        InputStream aInputStream = aSocket.getInputStream();
        aInputStream.read(a);
        return (new String(a));
    }
    static public void Write(Socket aSocket,String text) throws IOException{
        OutputStream aOutputStream = aSocket.getOutputStream();
        byte aText[] = text.getBytes();
        aOutputStream.write(aText);
    }
    public static void main(String[] args) throws IOException{
        aServer = new Server(5050);    
        SConnect c1 = new Connect();
        Sread r1 = new read();
        Swrite w1 = new write();
        c1.start();
        r1.start();
        w1.start();
    }
}

class SConnect implements Runnable{
    @Override
    public void run(){
        while(true){
            Socket serverSide = aServer.accept();      
            new clientThread()
        }
    }
}

class clientThread implements Runnable{
    String host;
    public clientThread(String H){
        host = H;
    }
    @Override
    public void run(){

    }
}