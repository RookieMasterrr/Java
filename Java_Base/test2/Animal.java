package test2;
/**
 * test_extends
 */
public class Animal {
    public String nick_name;
    private int age;
    private int weight;
    protected int pro_;
    public Animal(String nick_name, int age, int weight, int pro_){
        this.nick_name=nick_name;
        this.age=age;
        this.weight=weight;
        this.pro_=pro_;
    }
    public void display(){
        System.err.println("nickname:"+this.nick_name);
        System.out.println("age:"+this.age);
        System.out.println("weight:"+this.weight);
        System.out.println("pro_:"+this.pro_);
    }
    public static void main(String[] args) {
        System.out.println("Just From Extends");
        Mouse m1 = new Mouse("nick_name2", 2, 200,9,666);
        m1.display();
    }
}

final class Mouse extends Animal{
    private int annoy;
    public Mouse(String nick_name, int age, int weight,int annoy,int pro_) {
        super(nick_name, age, weight, pro_);
        this.annoy=annoy;
    }    
    public void display(){
        super.display();
        System.out.println(super.pro_);
        
        System.out.println("annoy:"+this.annoy);  
    }

}