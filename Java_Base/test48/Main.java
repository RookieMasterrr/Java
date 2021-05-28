import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        byte[] bytes = new byte[]{40, -37, -96, 46, -75, -10};
        String temp = new String(bytes,"ISO_8859_1");
        byte[] myBytes = temp.getBytes("ISO_8859_1");
        System.out.println(Arrays.toString(bytes));
        System.out.println(Arrays.toString(myBytes));
       
        
        
        // byte []b1 = "大大大大大大a".getBytes();
        
        // byte []b2 = new byte[b1.length];
        
        // for (int i = 0; i < b2.length; i++) {
        //     b2[i] = b1[i];    
        // }

        // for (byte b : b2) {
        //     System.out.println(b);
        // }
        




        // byte []b1 = "大大大大大大a".getBytes();
        // byte []b2 = "b小小小小小小".getBytes(); 
        // String s1 = new String(b1);
        // String s2 = new String(b2);
        
        // byte []b3 = (s1+s2).getBytes();
        // System.out.println(b1.length);
        // System.out.println(b2.length);
        // System.out.println(b3.length);
    
    }
}
