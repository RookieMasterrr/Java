package test;

public class class_test {
    static int a = 333;
    public String name = "ljf";
    private int pwd = 123;

    public class_test(String name, int pwd){
        this.name=name;
        this.pwd=pwd;
    }

    public void display(){
        System.err.println("name:"+this.name);
        System.err.println("pwd:"+this.pwd);
    }
    public static void main(String[] args) {
        class_test2 c = new class_test2("a", "b","c");
        c.dis_class2();
    }
}

class Info{
    static String static_secret="static_secret";
    private String secret;
    public String no_secret;
    public Info(String secret,String no_secret){
        this.secret=secret;
        this.no_secret=no_secret;
    }
    public void dis_secret(){
        System.err.println("secret:"+this.secret);
        System.err.println("no_secret:"+this.no_secret);
    }
}