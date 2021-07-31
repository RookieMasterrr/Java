import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
    static public void Write(Socket aSocket) throws IOException{
        OutputStream aOutputStream = aSocket.getOutputStream();
        InputStream aInputStream = System.in;
        byte a[] = new byte[65536];
        aInputStream.read(a);
        aOutputStream.write(a);
    }
    public static void main(String[] args) throws IOException{
        Server aServer = new Server(5050);    
        Socket serverSide = aServer.accept();    
//***********************************************************//
        
        while(true){
            System.out.println(Read(serverSide));
            System.out.println(serverSide.getRemoteSocketAddress());
            System.out.println(serverSide.getLocalSocketAddress());
            // Write(serverSide);
        }

//***********************************************************//
        // serverSide.close();
        // aServer.close();
    }
}
