import java.io.IOException;
import java.net.Socket;
import java.util.Random;

public class ClientStart {
	public static Server aServer;
	public static int chatPort;
	public static Socket chatSocket;
	public static Client aClient; //连接服务器的socket
    public static void main(String[] args) throws IOException {
    	Random aRandom = new Random();
    	chatPort = 6060+aRandom.nextInt(500);
    	aClient = new Client("192.168.0.106", 5050);
    	CCommunicator.aClient = aClient;

    	aClient.Write(ReturnChatPortAndIP(aClient.getLocalSocketAddress().toString()));
    	
    	
    	aServer = new Server(chatPort);

		Thread JGUI = new Thread(new GUIThread());
    	Thread JListen = new Thread(new ListeningThread());

    	System.out.println("chatPort = "+chatPort);

    	JGUI.start();

    	JListen.start();


	}
    public static String ReturnChatPortAndIP(String info) {
        int thePortIWantToChat = chatPort;

        System.out.println(info);
        
        String localSocketString;
        localSocketString = info.replace("/", "");
        String ipAddress = localSocketString.substring(0, localSocketString.indexOf(":")); 
        

        String chatInfo = ipAddress+":"+thePortIWantToChat;

        System.out.println("chatInfo="+chatInfo);
        
		System.out.println("ItsChatInfo'slen"+chatInfo.length());

        return chatInfo;
    }
}
class GUIThread implements Runnable{

	@Override
	public void run() {
		new LoginGUI();
	}
	
}

class ListeningUserMapThread implements Runnable{
	@Override
	public void run(){
		try{
			while(true){
				System.out.println(ClientStart.aClient.Read());
			}
			}catch(IOException exception){

		}
	}
}

class ListeningThread implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Port is Open Num = "+ClientStart.chatPort);
			Socket aSocket = ClientStart.aServer.accept();
			ClientStart.chatSocket = aSocket;
			
			System.out.println("ConnectSuccessfully");
			while(true){
				String chatText = Server.Read(aSocket);
//				CCommunicator.putChatTextToGUI(chatText);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}