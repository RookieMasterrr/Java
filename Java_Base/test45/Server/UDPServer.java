import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException{
        DatagramSocket aSocket = new DatagramSocket(8800);
        while(true){ 
            recADataGramPacket(aSocket);
        }
    }
    public static void recADataGramPacket(DatagramSocket recSocket) throws IOException{
        byte []data = new byte[20];
        DatagramPacket recPacket = new DatagramPacket(data, data.length);
        recSocket.receive(recPacket);
        String text = new String(data);
        System.out.println(text);
    }
}
