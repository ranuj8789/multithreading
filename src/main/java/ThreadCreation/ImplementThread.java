package ThreadCreation;

public class ImplementThread implements Runnable {
    @Override
    public void run() {
        System.out.println("hello from implement " + Thread.currentThread().getName());
    }
}
