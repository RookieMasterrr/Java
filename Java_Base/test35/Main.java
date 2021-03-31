package test35;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new J_Thread(1));
        Thread t2 = new Thread(new J_Thread(2));
        Thread t3 = new Thread(new J_Thread(3));
        t1.start();
        t2.start();
        t3.start();
        System.out.println("End");
    }
}

class J_Thread implements Runnable{
    int id;
    J_Thread(int ID){
        id=ID;
    }
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.printf("id=%d ",id);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    
}
}
