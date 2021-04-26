// GUI and Socket Communicator

import java.io.IOException;
import java.net.Socket;
public class SCommunicator {
    static Server aServer;
    static Socket serverSide;
    // public static void LoginSentUsernameAndPasswordFromGUItoSocket (String username, String password)throws IOException{
    //     String tempString = username+password;
    //     aServer = new Client("localhost", 5050);
    //     // System.out.println(aServer.getInetAddress().getHostAddress());
    //     aServer.Write(tempString);
    //     LoginGUI.aFrame.dispose();
    //     // System.out.println("?");
    //     new chatGUI();
        
    //     ChatFromServerToUser();
    //     System.out.println("hello?");
    //     // while(true){

    //     // }
    // }
    public static void ChatFromUserToServer(String text) throws IOException{
        try{
            Server.Write(serverSide,text);
        }catch(IOException aException){

        }
    }
    public static void toTheScreen(String text) throws IOException{
        serverGUI.RecArea.setText(text);
    }
    public static void changeConnectStatus(String text){
        serverGUI.connectJLabel.setText(text);
    }
}