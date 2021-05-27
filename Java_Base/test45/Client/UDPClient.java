import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws IOException{
        sentADataGramPacket("text", "localhost", 8800);
    }
    public static DatagramPacket sentADataGramPacket(String text, String host, int port) throws IOException{
        DatagramSocket aDatagramSocket = new DatagramSocket();
        byte[] data = text.getBytes();
        InetAddress reciverHost = InetAddress.getByName(host);
        DatagramPacket sendPacket = new DatagramPacket(data, data.length,reciverHost,port);
        aDatagramSocket.send(sendPacket);
        aDatagramSocket.close();
        return sendPacket;
    }
}
