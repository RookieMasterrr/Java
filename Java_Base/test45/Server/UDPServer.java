import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class UDPServer {
    public static void main(String[] args) throws IOException{
        DatagramSocket aSocket = new DatagramSocket(8800);
        System.out.println("Listening...");
        while(true){ 
            // 获得发送包的的个数,每个包的长度,总长度
            String howManysInfo = (new String(recComingPackagesNumsAndEachLength(aSocket)));
            String []Infos = howManysInfo.split(",");
            int Nums = Integer.parseUnsignedInt(Infos[0]);
            int eachLength = Integer.parseUnsignedInt(Infos[1]);
            int totalLength = Integer.parseUnsignedInt(Infos[2]);
            System.out.println(Nums);
            System.out.println(eachLength);
            System.out.println(totalLength);
            //开始接受一张图片的各部分字节数组 
            String aString = "";
            for(int i=0; i<Nums; i++){
                if(i!=Nums-1){
                    recADataGramPacket(aSocket, eachLength);
                    aString+=
                }else{
                    recADataGramPacket(aSocket, totalLength-((Nums-1)*eachLength));
                }
            }
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

        String aString = new String(realData);
        return realData;
    }

}
