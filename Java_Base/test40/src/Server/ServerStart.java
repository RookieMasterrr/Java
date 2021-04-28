import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.net.Socket;
import java.sql.Time;
import java.util.ArrayList;


public class ServerStart {
    static ArrayList<String> ipList;
    static ArrayList<Socket> connectList;
    public static void main(String[] args) throws IOException, AWTException {
        ipList = new ArrayList<String>();
        connectList = new ArrayList<Socket>();
        new ServerMenuGUI();
        Server aServer = new Server(5050);    
        Robot robot = new Robot();
        while(true){
            Socket serverSide = aServer.accept();
            
            String thisConnectionsChatAddressString = Server.Read(serverSide);
            
//            robot.delay(1000);
            System.out.println("New Connection!Chat Port = ");
            
            System.out.println(thisConnectionsChatAddressString);
            
//            Server.Write(serverSide, "Userlist"+ipList.toString());

            ipList.add(thisConnectionsChatAddressString);
            connectList.add(serverSide);
            
            remindAllUser();


        }
    }
    public static void remindAllUser() throws IOException {
    	for(Socket x:connectList) {
    		String sendInfoString = "Userlist"+ipList.toString();
    		Server.Write(x,sendInfoString);
    		System.out.println("serverinfohere");
    		System.out.println(sendInfoString);
    		
    	}
    }
}