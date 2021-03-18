package test12;

public class Main {
    public static void main(String[] args) {
        // string不可修改，只是指向了新的地方
        // StringBuffer/StringBuilder本身可以被修改
        // Constructor 
        StringBuilder s1 = new StringBuilder("zz");
        StringBuilder s2 = new StringBuilder(10);
        System.out.println(s1);
        System.out.println(s2);
    
        // Methods
        System.out.println(s1.toString());//StringBuilder's toString have been Override
        StringBuilder s3 = new StringBuilder();//StringBuilder's initial capacity is 16
        System.out.println(s3.capacity());
        
        StringBuilder s4 = new StringBuilder("abcdefg");
        System.out.println(s4.subSequence(0, 2));

        // Others...
        // https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
    }
}

class Animal{
    public Animal(){

    }
    public String toString(){
        return String.format("%s the toString Methods", "Override");
    }
}