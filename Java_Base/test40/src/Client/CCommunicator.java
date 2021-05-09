// GUI and Socket Communicator

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.ProcessHandle.Info;

import javax.swing.JButton;
public class CCommunicator {
    static Client aClient;
    static Client chatClient;
    public static void LoginSentUsernameAndPasswordFromGUItoSocket (String username, String password)throws IOException{
        String tempString = username+password;
        LoginGUI.aFrame.dispose();
        
		// ClientMenuGUI
        Thread t1 = new Thread(new test());
        t1.start();
        
		// 
		Thread t2 = new Thread(new test2());
        t2.start();
        
        
    }


    public static void ClientListening() throws IOException {
    	while(true) {
    		System.out.println("TextFromServer");
    		String Info = aClient.Read();
			System.out.println(Info);
    		System.out.println(Info);
    		if(Info.indexOf("Userlist")!=-1) {
    			addButton(Info);
    		}else {
    			
    		}
    	}
    }
    

	
    public static void addButton(String ButtonInfo) {
        String aString = ButtonInfo;

		String temp2 = aString.replace("Userlist", "");
        String temp3 = (temp2.replace("[", ""));
        String temp4 = temp3.replace("]", "");
        String temp5 = temp4.replace(" ", "");
        String []iplist = temp5.split(",");

        for(String i:iplist){
        	System.out.println(i);
        	JButton otherClientButton = new JButton(i);
        	otherClientButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
				}
			});
        	ClientMenuGUI.aJPanel.add(otherClientButton);
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