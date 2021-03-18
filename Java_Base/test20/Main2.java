package test20;

public class Main2 {
    String aString;
    public static void main(String[] args) {
        Main2 m = new Main2();
        m.aString = "ljf";
        System.out.println(m.aString);
        Test(m.aString);
        System.out.println(m.aString);
    }
    public static void Test(String xString){
        xString="zzz";
    }
}
