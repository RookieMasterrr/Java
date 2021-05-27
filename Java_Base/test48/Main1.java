import java.nio.ByteBuffer;

// 尝试用Array List替代字节数组
public class Main1 {
    public static void main(String[] args) {
        byte []byte1 = "��i�Nn�fV��fRv�".getBytes();
        byte []byte2 = "5678".getBytes();
        byte []byte3 = joinByteArray(byte1, byte2);
        System.out.println(new String(byte3));
    }    
    public static byte[] joinByteArray(byte[] byte1, byte[] byte2) {
        return ByteBuffer.allocate(byte1.length + byte2.length).put(byte1).put(byte2).array();
    }
}