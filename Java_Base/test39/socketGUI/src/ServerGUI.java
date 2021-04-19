import java.io.IOException;
import java.net.Socket;

public class ServerGUI {
    public static void main(String[] args) throws IOException {
        myGUIS.init();
        Server aServer = new Server(5050);    
        Socket serverSide = aServer.accept();   

        while(true){
            myGUIS.display(Server.Read(serverSide));
        }
    }
}
