import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException{
        DatagramSocket aSocket = new DatagramSocket(8800);
        System.out.println("Listening...");
        while(true){ 
            // ��÷��Ͱ��ĵĸ���,ÿ�����ĳ���,�ܳ���
            String howManysInfo = (new String(recComingPackagesNumsAndEachLength(aSocket)));
            String []Infos = howManysInfo.split(",");
            int Nums = Integer.parseUnsignedInt(Infos[0]);
            int eachLength = Integer.parseUnsignedInt(Infos[1]);
            int totalLength = Integer.parseUnsignedInt(Infos[2]);
            System.out.println(Nums);
            System.out.println(eachLength);
            System.out.println(totalLength);
            //��ʼ����һ��ͼƬ�ĸ������ֽ����� 
            String aString = "";
            for(int i=0; i<Nums; i++){
                if(i!=Nums-1){
                    recADataGramPacket(aSocket, eachLength);
                    
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
