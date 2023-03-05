package ThreadCreation;

public class WaysToCreateThread {
    public static void main(String[] args) {
        Thread threadExtend= new Thread(new ExtendThread());
        threadExtend.start();
        Thread threadImplement= new Thread(new ImplementThread());
        threadImplement.start();
        Thread threadAnonymous = new Thread(()->{
            System.out.println("Lambda function interface "+ Thread.currentThread().getName());
        });
        threadAnonymous.start();
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous Class " + Thread.currentThread().getName());
            }
        };
        new Thread(runnable).start();
    }
}


