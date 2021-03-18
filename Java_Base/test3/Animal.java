package test3;
public class Animal {
    public int age;
    public Animal(int age){
        this.age=age;
    }
    public void display(){
        System.out.println("SuperWay");
        System.out.printf("Age:%d\n", this.age);
    }
    public static void main(String[] args) {
        Dog d = new Dog(100);
        d.display();
        d.bark();
    }
}
class Dog extends Animal{
    public Dog(int age) {
        super(age);
    }
    public void bark(){
        System.out.println("Dog is bark");
    }
    public void display(){
        // System.out.println("SubWay");
        // System.out.printf("Age:%d\n",this.age);
        super.display();
    }
}