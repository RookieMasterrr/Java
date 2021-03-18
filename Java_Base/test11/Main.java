package test11;

public class Main {
    public static void main(String[] args) {
        String aString = "ITisaString";
        String as = new String("original");//两种构造方法
        System.out.println(aString);
        System.out.println(as);
    
        String aString2 = as.concat(aString);//String连接方法concat
        System.out.println(aString2);
        String a = "a"+"B";
        System.out.println(a);//这个也可以
        
        System.out.printf("It is a format %s\n",a);//格式化输出printf
    
        Test t1 = new Test();
        System.out.println(t1);
    }
}

class Test{
    public Test(){}
    public String toString(){
        return String.format("%s have overde the %s", "I","Override");
    }
}