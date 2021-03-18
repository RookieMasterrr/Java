package test17;

public class Main2 {
    public static void main(String[] args) {
        try{
            int a = 1;
            if(a>0){
                throw (new ex("aaaas"));
            }
        }catch (ex e) {
            System.out.println(e.aString);
        }
    }
}

class ex extends Exception{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    String aString;
    public ex(String aString){
        this.aString = aString;
    }
}