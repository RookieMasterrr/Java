package test11;

public class Main2 {
    public static void main(String[] args) {
        String aString = new String("123456");
        System.out.println(aString);

        String []a = aString.split("3");

        for(String i:a){
            System.out.println(i);
        }

        System.out.println("  123   ".trim());

    }
}
