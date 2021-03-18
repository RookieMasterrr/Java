package test10;

public class Main {
    public static void main(String[] args) {
        char a = 'c';
        System.out.println(a);
        char []array={'a','b','c','d'};
        System.out.println(array);
        System.out.println(Character.isLetter('z')) ;//static methods
        System.out.println(Character.toString('c'));
        
        Animal a1 = new Animal();
        System.out.println(a1.getClass());//getClass()
        System.out.println( a1 instanceof Object );//instanceof
    }
}

class Animal{
    Animal(){}
}