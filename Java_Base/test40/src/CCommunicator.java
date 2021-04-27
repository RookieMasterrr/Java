// GUI and Socket Communicator

import java.io.IOException;

import javax.swing.JButton;
public class CCommunicator {
    static Client aClient;
    public static void LoginSentUsernameAndPasswordFromGUItoSocket (String username, String password)throws IOException{
        String tempString = username+password;
        LoginGUI.aFrame.dispose();
        
        Thread t1 = new Thread(new test());
        t1.start();
        
        Thread t2 = new Thread(new test2());
        t2.start();
        
        
    }


    public static void ClientListening() throws IOException {
    	while(true) {
    		String Info = aClient.Read();
			System.out.println(Info);
    		if(Info.indexOf("Userlist")==0) {
//    			更新列表的信息
    			System.out.println("ItsUserListInfo");
    			addButton(Info);
//    			JButton otherClientButton = new JButton("Hello!");
//    			ClientMenuGUI.aJLabel.setText(Info);
//    			ClientMenuGUI.aJPanel.revalidate();
    		}else {
    			
    		}
    	}
    }
    
    public static void addButton(String ButtonInfo) {
        String aString = ButtonInfo;
        String temp1 = aString.substring(8);
        String temp2 = (temp1.replace("/", ""));
        String temp3 = (temp2.replace("[", ""));
        String temp4 = temp3.replace("]", "");
        String temp5 = temp4.replace(" ", "");
        String []iplist = temp5.split(",");
        for(String i:iplist){
        	System.out.println("LLLL");
        	JButton otherClientButton = new JButton("Hello!");
        	ClientMenuGUI.aJPanel.revalidate();
        }    
        }
}



class test implements Runnable{

	@Override
	public void run() {
		new ClientMenuGUI();
	}
	
}

class test2 implements Runnable{
	@Override
	public void run(){
    	try {
			CCommunicator.ClientListening();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}