import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> checkStatus = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "good";
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> returnFromcallable = executorService.(checkStatus);
        System.out.println(returnFromcallable.get());
    }
}
`