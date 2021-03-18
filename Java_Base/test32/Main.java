package test32;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello?");
        String aString = "123456";
        String bString = new String("123456");
        System.out.println(aString==bString);
        System.out.println(aString.equals(bString));
        System.out.println(aString.hashCode());
        System.out.println(bString.hashCode());
        Object aObject = new Object();
        System.out.println(aObject.hashCode());
        System.out.println(aObject instanceof String);
        System.out.println(bString instanceof String);
    }
}