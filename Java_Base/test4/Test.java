package test4;

public class Test {
    public static void main(String[] args) {
        Animal d1 = new dog();
        d1.draw();
        System.out.println(d1 instanceof Animal);
    }
}

abstract class Animal{
    protected abstract void draw();
}

final class dog extends Animal{
    public final void draw(){
        System.out.println("Bark!");
    }
}

final class bird extends Animal{
    public final void draw(){
        System.out.println("BIBI!");
    }
}