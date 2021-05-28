import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/**
 * Main1
 */
public class Main1 {

    public static void main(String[] args) throws UnsupportedEncodingException {
        // byte []byte1 = new byte[]{00,00,00,01};
        // int num = ByteBuffer.wrap(byte1);
        
        // System.out.println(num);
        // int num2 = ByteBuffer.wrap(byte1).getInt();
        // System.out.println(num2);
        // int num3 = ByteBuffer.wrap(byte1).getInt();
        // System.out.println(num3);

        byte []bytes = {49,0,0,0,0,0,0,0,0};
        // byte []bytes = {49};
        String aString = new String(bytes);

        System.out.println(aString);
        System.out.println(aString.length());
        // int num = Integer.parseInt(aString);
        // int num = Integer.
        


    }
}