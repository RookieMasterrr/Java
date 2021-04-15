package test12;

// import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        // int a[]={1,2,3,4,5,6};

        String aString="123456";
        // for(int i:a){
        //     aString+=(String.format("%d", i));
        // }

        System.out.println("aString="+aString);
        System.out.println();

        System.out.println(aString.length());
        System.out.println("123456".length());
        
        System.out.println();
        System.out.println(aString.getClass());
        System.out.println("123456".getClass());
        
        System.out.println();
        System.out.println(aString.equals("123456"));
        System.out.println(aString.compareTo("123456"));

    }
}
