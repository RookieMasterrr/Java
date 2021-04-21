// GUI and Socket Communicator

import java.io.IOException;
public class Communicator {
    static Client aClient;
    public static void LoginSentUsernameAndPasswordFromGUItoSocket (String username, String password)throws IOException{
        String tempString = username+password;
        aClient = new Client("localhost", 5050);
        // System.out.println(aClient.getInetAddress().getHostAddress());
        aClient.Write(tempString);
        LoginGUI.aFrame.dispose();
        // System.out.println("?");
        new chatGUI();
        
        ChatFromServerToUser();
        System.out.println("hello?");
        // while(true){

        // }
    }
    public static void ChatFromUserToServer(String text) throws IOException{
        aClient.Write(text);
    }
    public static void ChatFromServerToUser() throws IOException{
        String text = aClient.Read();
        System.out.println("textFromServer="+text);
        chatGUI.RecArea.setText(text);
    }
}