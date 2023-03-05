package ThreadCreation;

public class ExtendThread extends Thread{
    @Override
    public void run(){
        System.out.println("hello from thread" + Thread.currentThread().getName());
    }
}
