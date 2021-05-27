public class Main1 {

    public static void main(String[] args) {
        byte bytes1[] = "|Hello".getBytes();
        byte bytes2[] = " World!".getBytes();
        byte bytes3[] = " Again|".getBytes();



        System.out.println(new String(threeBytes2OneBytes(bytes1, bytes2, bytes3)));

        String divide_result[] = divideTheBytesToMainParts(threeBytes2OneBytes(bytes1, bytes2, bytes3),3);
        
        System.out.println("Result:");
        for (String string : divide_result) {
            System.out.println(string);
        }
    }

    public static String[] divideTheBytesToMainParts(byte bytes[],int eachLength){
        int total_Length = bytes.length;
        String allString = new String(bytes);
        
        int howmany=0;
        if(total_Length%eachLength==0){
            howmany=total_Length/eachLength;
        }else{
            howmany=(total_Length/eachLength)+1;
        }        

        String []PartsList = new String[howmany];
        for(int i=0; i<howmany; i++){
            if(i!=howmany-1){
                String eachPart = allString.substring(i*eachLength,(i+1)*(eachLength));
                PartsList[i] = eachPart;
            }else{
                String eachPart = allString.substring(i*eachLength,allString.length());
                PartsList[i] = eachPart;
            }
        }
        // System.out.println("divideResult:");
        // int realhowmany = 0;
        // for (String string : PartsList) {
        //     // System.out.println(string);
        //     // System.out.println(string.length());
        //     realhowmany++;
        // }

        return PartsList;
        // System.out.println("realhowmany:"+realhowmany);
    }
    
    
    public static byte[] threeBytes2OneBytes(byte bytes1[],byte bytes2[],byte bytes3[]){
        String s1 = new String(bytes1);
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