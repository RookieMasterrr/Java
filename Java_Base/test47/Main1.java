public class Main1 {

    public static void main(String[] args) {
        byte bytes1[] = "|n�fV�lo".getBytes();
        byte bytes2[] = " n�fV�!".getBytes();
        byte bytes3[] = " Again|".getBytes();

        System.out.println("idealLength="+(bytes1.length+bytes2.length+bytes3.length));
        byte byte4[] = threeBytes2OneBytes(bytes1, bytes2, bytes3);
        System.out.println(byte4.length);

        // // System.out.println(new String(threeBytes2OneBytes(bytes1, bytes2, bytes3)));

        // // ��i�Nn�fV��fRv�
        // byte []a = "��i�Nn�fV��fRv�".getBytes();

        // String divide_result[] = divideTheBytesToMainParts(a,8);
        


        // System.out.println("Result:");
        // for (String string : divide_result) {
        //     byte temp[] = string.getBytes();
        //     System.out.println(temp.length); 
        // }
    }

    public static String[] divideTheBytesToMainParts(byte bytes[],int eachLength){
        int total_Length = bytes.length;
        System.out.println("a'slength="+total_Length);
        String allString = new String(bytes);
        
        System.out.println("String'sLength="+allString.length());

        int howmany=0;
        if(total_Length%eachLength==0){
            howmany=total_Length/eachLength;
        }else{
            howmany=(total_Length/eachLength)+1;
        }        

        String []PartsList = new String[howmany];
        for(int i=0; i<howmany; i++){
            System.out.println("i = "+i);
            if(i!=howmany-1){
                String eachPart = allString.substring(i*eachLength,(i+1)*(eachLength));
                PartsList[i] = eachPart;
            }else{
                String eachPart = allString.substring(i*eachLength,allString.length());
                PartsList[i] = eachPart;
            }
        }
        return PartsList;
    }
    
    
    public static byte[] threeBytes2OneBytes(byte bytes1[],byte bytes2[],byte bytes3[]){
        String s1 = new String(bytes1);
        System.out.println("S1length"+s1.length());
        String s2 = new String(bytes2);
        String s3 = new String(bytes3);

        String s4 = s1 + s2 + s3;

        byte bytes4[] = s4.getBytes();
        return bytes4;
    }


    public void displayThreeBytes(byte bytes1[],byte bytes2[],byte bytes3[]){
        for (byte a : bytes1) {
            System.out.println(a);
        }
        System.out.println();
        for (byte b : bytes2) {
            System.out.println(b);
        }
        System.out.println();
        for (byte c : bytes3) {
            System.out.println(c);
        }
        System.out.println();
    }
}