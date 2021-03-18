package test18;


public class Main {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;
        test(a,b,c);
        // System.exit(0);
        System.out.println(System.currentTimeMillis());
        
    }
    static void test(int...is){
        System.out.println("It is a Test");
        for(int ele:is){
            System.out.println(ele);
        }
    }
}