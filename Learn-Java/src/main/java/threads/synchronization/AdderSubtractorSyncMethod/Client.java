package threads.synchronization.AdderSubtractorSyncMethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        Value value = new Value(0);

        Adder adder = new Adder(value);
        Subtractor subtractor = new Subtractor(value);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Void> add = executorService.submit(adder);
        Future<Void> sub = executorService.submit(subtractor);

        try {
            add.get();
            sub.get();
            System.out.println(value.getValue());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
