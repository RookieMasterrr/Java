package test17;

public class Main {
    public static void main(String[] args){
        try{
            Test t1 = new Test(1);
            t1.judge();
        }catch (AError e) {
            e.error_statement();
        }
    }
}

class Test{
    int a;
    public Test(int a){
        this.a=a;
    }
    public void judge() throws AError{//可能抛出的错误
        if(a>0){
            throw (new AError("Error!A>0"));
        }
    }
}

class AError extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String statemenString;
    
    public AError(String erroe){
        this.statemenString = erroe;
    }
    
    public void error_statement(){
        System.err.println(statemenString);
    }
}