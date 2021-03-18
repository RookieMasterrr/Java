package test20;

public class Main {
    static String ex = new String("ljf");
    String ex2;
    public static void main(String[] args) {
        System.out.println(ex);
        testtt(ex);
        System.out.println(ex);

        Main m = new Main();
        m.ex2 = "hello?";
        System.out.println(m.ex2);
        testtt2(m);
        System.out.println(m.ex2);
        //所以是否改变是要看函数定义的接受参数，要是基本类型就不改，要是是自定义类型就可以改
    }
    static void testtt(String a){
        a="aaa";
    }
    public static void testtt2(Main m){
        m.ex2="zzz";
    }
}
