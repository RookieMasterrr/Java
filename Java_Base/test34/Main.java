package test34;

public class Main {
    public static void main(String[] args) {
        A a1 = new A(1);
        System.out.println(a1==a1);
        int a=1;
    }
}

class A{
    Integer a;
    public A(Integer aa){
        a=aa;
    }
    public int re(){
        return a;
    }
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
}


A.clone().a=A.a

class A{
    int a=;
    int b;
}