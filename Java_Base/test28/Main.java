package test28;

public class Main {
    public static void main(String[] args) {
        String  aString = "abcd";
        System.out.println(aString);

        byte b[] = aString.getBytes();
        
        System.out.println(b);
        for (int index:b){
            System.out.println((char)index);
        }

        System.out.println(new String(aString.getBytes()));
    }
}