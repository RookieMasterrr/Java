import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends Socket{
    public Client(String H,int P)throws IOException{
        super(H,P);
    }
    public void Write()throws IOException{
        OutputStream aOutputStream = this.getOutputStream();
        InputStream sFromKeyBoard = System.in;
        byte a[] = new byte[65536];
        sFromKeyBoard.read(a);
        aOutputStream.write(a);
    }
    public String Read() throws IOException{
        InputStream aInputStream = this.getInputStream();
        byte a[] = new byte[65536];
        aInputStream.read(a);
        return (new String(a));
    }
    public static void main(String[] args) throws IOException{
        Client clientSide = new Client("localhost", 5050);
//***********************************************************//
        while(true){
            clientSide.Write();
            // System.out.println(clientSide.Read());
        }
        
        
//***********************************************************//        
        // clientSide.close();
    }
}
