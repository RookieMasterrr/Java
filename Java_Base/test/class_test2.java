package test;
public class class_test2{
    static String class2_sta="static_secret";
    private String class2_pri;
    public String class2_pub;
    protected String class2_pro;
    public class_test2(String a,String b,String c){
        this.class2_pri=a;
        this.class2_pub=b;
        this.class2_pro=c;
    }
    public void dis_class2(){
        System.err.println("class2_pri:"+this.class2_pri);
        System.err.println("class2_pub:"+this.class2_pub);
        System.err.println("class2_pro:"+this.class2_pro);
    }
}
