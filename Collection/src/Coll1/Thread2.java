package Coll1;

public class Thread2 extends Thread{
    
    public void run(){
        for (int i=10;i<15;i++){
            System.out.println("Thread 2:"+i);
        }
   
}
}
