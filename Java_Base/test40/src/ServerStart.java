import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;


public class ServerStart {
    static ArrayList<String> arrayList;
    public static void main(String[] args) throws IOException {
        arrayList = new ArrayList<String>();
        new menuGUI();
        Server aServer = new Server(5050);    
        while(true){
            Socket serverSide = aServer.accept();
            arrayList.add(serverSide.getRemoteSocketAddress().toString());
            Server.Write(serverSide);
            // menuGUI.SomeoneConnect(serverSide.getRemoteSocketAddress().toString());
            // menuGUI.aJLabel.setText(serverSide.getRemoteSocketAddress().toString()+"connect");
        }
    }
    public static String makeListToString(ArrayList<String> arrayList){
        
    }
}