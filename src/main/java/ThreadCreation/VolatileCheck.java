package ThreadCreation;

public class VolatileCheck extends Thread {
    public volatile boolean running=true;

    public void run(){
        while(running){
            System.out.println("hello How are you");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void shutDown(){
        running=false;
    }
}
