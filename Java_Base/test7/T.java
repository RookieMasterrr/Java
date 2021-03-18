package test7;

public class T {
    int A;

    T(int A){
        this.A=A;
    }
    T(){

    }
    public static void main(String[] args) {
        // t t1=new t();//默认构造方法
        // t1.A=1;
    }
}

class tt extends T {
    int  a;//若子类需要用到默认构造函数,父类必须有一个无参构造函数,或者父类也使用默认构造函数
}