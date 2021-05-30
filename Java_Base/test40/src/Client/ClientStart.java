import java.io.IOException;
import java.net.Socket;
import java.util.Random;


public class ClientStart {
	public static Server aServer;
	public static int chatPort;
	public static Socket chatSocket;
	public static Client aClient;
    public static void main(String[] args) throws IOException {
    	Random aRandom = new Random();
    	chatPort = 6060+aRandom.nextInt(500);
    	aClient = new Client("localhost", 5050);
    	CCommunicator.aClient = aClient;

    	aClient.Write(ReturnChatPortAndIP(aClient.getLocalSocketAddress().toString()));
    	
    	
    	aServer = new Server(chatPort);

		Thread JGUI = new Thread(new GUIThread());

		// ���������û�����
    	Thread JListen = new Thread(new ListeningConnectionThread());

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

class ListeningConnectionThread implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Port is Open Num = "+ClientStart.chatPort);
			Socket aSocket = ClientStart.aServer.accept();
			System.out.println("Socket's detail="+aSocket.getRemoteSocketAddress());
			ClientStart.chatSocket = aSocket;
			CCommunicator.chatSocket = aSocket;

			System.out.println("ConnectSuccessfully");
			new chatGUI();
			System.out.println("ReadToGetText");
			
			Thread listeningChatThread = new Thread(new ListeningChatInfoThread(aSocket));
			listeningChatThread.start();
			// while(true){
			// 	System.out.println("ReadToGetText");
			// 	String chatText = Server.Read(aSocket);
			// 	System.out.println(chatText);
			// }
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
}


class ListeningChatInfoThread implements Runnable{
	Socket listeningSocket;
	public ListeningChatInfoThread(Socket aSocket){
		listeningSocket = aSocket;
	}
	@Override
	public void run(){
		while(true){
			String chatText;
			try {
				chatText = Server.Read(listeningSocket);
				if(chatText.indexOf("VideoRequest:")==0){

					String realInfo = chatText.substring(chatText.indexOf("@|")+2,chatText.lastIndexOf("@|"));
					System.out.println("realInfo="+realInfo);


					String UDPHost = realInfo.split(":")[0];
					int UDPPort = Integer.parseInt(realInfo.split(":")[1]);
					System.out.println("UDPHost="+UDPHost);
					System.out.println("UDPPort="+UDPPort);
					

				}else{
					System.out.println(chatText);
					System.out.println("Length="+chatText.length());
					CCommunicator.removeChatInfoToGUI(chatText);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	}
}