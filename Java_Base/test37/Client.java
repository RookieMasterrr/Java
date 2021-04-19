import java.io.IOException;
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
    public static void main(String[] args) throws IOException{
        Client clientSide = new Client("localhost", 5050);
//***********************************************************//

        clientSide.Write("Hello");
        
        
        
        
//***********************************************************//        
        clientSide.close();
    }
}
