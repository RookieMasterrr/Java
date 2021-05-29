import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UDPServer {
    public static void main(String[] args) throws IOException{
        new J_VideoGUI();
        // 
        // Define RecPort
        DatagramSocket aSocket = new DatagramSocket(8800);
        System.out.println("Listening...");
        
        while(true){
            J_VideoGUI.jLabel.setIcon(J_Video.recEachPicAndDisplay(aSocket));
        }


    }
    public static byte[] recADataGramPacket(DatagramSocket recSocket,int LengthYourWant) throws IOException{
        byte []data = new byte[LengthYourWant];
        DatagramPacket recPacket = new DatagramPacket(data, data.length);
        recSocket.receive(recPacket);
        return data;
    }

    public static byte[] recComingPackagesNumsAndEachLength(DatagramSocket recSocket) throws IOException{
        byte []data = new byte[100];
        DatagramPacket recPacket = new DatagramPacket(data, data.length);
        recSocket.receive(recPacket);
        int realLength = 0;
        byte zero = 0;
        for (byte b : data) {
            if (b==zero){
                break;    
            }else{
                realLength++;
            }
        }
        byte []realData = new byte[realLength];
        for(int i=0; i<realLength; i++){
            realData[i] = data[i];
        }
        return realData;
    }

}
