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
            // Server.Read(serverSide);
            System.out.println("thisconne's="+thisConnectionsChatAddressString);
            System.out.println("thisconne'slen="+thisConnectionsChatAddressString.length());
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
            System.out.println("Begin");
    		String sendInfoString = ipList.toString();
            // String sendInfoString = "L"+ipList.toString();
    		// sendInfoString = sendInfoString.replace("[", "");
            // sendInfoString = sendInfoString.replace("]", "");
            // sendInfoString = sendInfoString+"1233213";
            String testString = "[192.168.0.106:6068]";
            System.out.println(testString.length());
            System.out.println(sendInfoString.length());
            Server.Write(x,sendInfoString.replace("",""));
    		System.out.println("serverinfohere");
    		System.out.println(sendInfoString);
    		System.out.println("End");
    	}
    }
}