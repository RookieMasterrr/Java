import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends ServerSocket{
    public Server(int P)throws IOException{
        super(P);
    }
    static public String Read(Socket aSocket)throws IOException{
        byte a[] = new byte[65536];
        InputStream aInputStream = aSocket.getInputStream();
        aInputStream.read(a);
        return (new String(a));
    }
    public static void main(String[] args) throws IOException{
        Server aServer = new Server(5050);    
        Socket serverSide = aServer.accept();    
//***********************************************************//


        System.out.println(Read(serverSide));



//***********************************************************//
        serverSide.close();
        aServer.close();
    }
}
