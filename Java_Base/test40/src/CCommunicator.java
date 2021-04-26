// GUI and Socket Communicator

import java.io.IOException;
public class CCommunicator {
    static Client aClient;
    public static void LoginSentUsernameAndPasswordFromGUItoSocket (String username, String password)throws IOException{
        String tempString = username+password;
        aClient.Write(tempString);
        LoginGUI.aFrame.dispose();
        new ClientMenuGUI();
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